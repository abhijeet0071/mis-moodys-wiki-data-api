# SSL TrustStore
### 1. Keep track of Root and intermmediate certs related instructions from Moody's SSL team and also from AWS and add it to the docker container and/or to the java truststore using keytool.
    https://aws.amazon.com/blogs/security/how-to-prepare-for-aws-move-to-its-own-certificate-authority/
    https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html
    https://aws.amazon.com/blogs/database/amazon-rds-customers-update-your-ssl-tls-certificates-by-february-5-2020/


    https://moodys-my.sharepoint.com/:f:/p/ghoshs/EmsnGpI-VZdBvWtXYe85hiUBq1Rog3zjTgS05p15GcEbEQ?e=4UmICv
    https://moodys-my.sharepoint.com/personal/ghoshs_moodys_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fghoshs%5Fmoodys%5Fcom%2FDocuments%2FNew%20Certs

    Example: To download the MINT's ssl certificate ( root / intermmediate )
    https://www.feistyduck.com/library/openssl-cookbook/online/ch-testing-with-openssl.html
    echo -n | openssl s_client -connect mint.sp.moodys.net:443 | sed -ne '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' > mint.crt

    To add it to import it in your JVM truststore (to establish a chain of trust): 
    https://docs.oracle.com/cd/E12440_01/rpm/pdf/141/html/merch_sg/apps-chapter%207.htm
    <JAVA_HOME>\bin\keytool -import -v -trustcacerts -alias server-alias -file pubkey.cer -keystore cacerts.jks -keypass changeit -storepass changeit