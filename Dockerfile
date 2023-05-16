FROM 443610414248.dkr.ecr.us-east-1.amazonaws.com/amazoncorretto:17.0.2

RUN yum -y install wget ncurses procps net-tools
RUN yum -y update

# Clean up yum when done
RUN yum clean all

# Add trusted certs - internal SSL Root Cert ad.moodys.net
ADD devops/ssl/truststore/*.crt /etc/pki/ca-trust/source/anchors/
RUN update-ca-trust force-enable
RUN update-ca-trust extract



# Add the linux user 'spring' to start the java process
RUN adduser -d /opt/spring spring
WORKDIR /opt/spring

#Add compiled code from build server


COPY build/libs/*.jar app.jar

COPY startup.sh startup.sh 

# Create directory for AppD agent
RUN mkdir /opt/spring/appd

RUN chmod -R 777 /opt/spring

# Define Entry Point
USER spring
ENTRYPOINT ["/bin/sh", "/opt/spring/startup.sh"]
