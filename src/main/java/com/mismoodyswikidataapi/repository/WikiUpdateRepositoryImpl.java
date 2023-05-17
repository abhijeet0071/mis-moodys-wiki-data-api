package com.mismoodyswikidataapi.repository;

import com.mismoodyswikidataapi.repository.api.*;
import com.mismoodyswikidataapi.repository.helpers.BindSpecHelper;
import com.mismoodyswikidataapi.repository.helpers.PreDeleteHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Repository
public class WikiUpdateRepositoryImpl implements WikiUpdateRepository {

    private static final String SYSTEM_ID = "systemId";
    private static final String SYSTEM_NAME = "systemName";
    private static final String APPLICATION_ID = "applicationId";
    private static final String APPLICATION_NAME = "applicationName";
    private static final String ABOUT = "about";
    private static final String HIGHLIGHT = "highlight";
    private static final String UPSTREAM01 = "upstream01";
    private static final String UPSTREAM02 = "upstream02";
    private static final String UPSTREAM03 = "upstream03";
    private static final String UPSTREAM04 = "upstream04";
    private static final String UPSTREAM05 = "upstream05";
    private static final String UPSTREAM06 = "upstream06";
    private static final String UPSTREAM07 = "upstream07";
    private static final String UPSTREAM08 = "upstream08";
    private static final String UPSTREAM09 = "upstream09";
    private static final String UPSTREAM10 = "upstream10";
    private static final String DOWNSTREAM01 = "downstream01";
    private static final String DOWNSTREAM02 = "downstream02";
    private static final String DOWNSTREAM03 = "downstream03";
    private static final String DOWNSTREAM04 = "downstream04";
    private static final String DOWNSTREAM05 = "downstream05";
    private static final String DOWNSTREAM06 = "downstream06";
    private static final String DOWNSTREAM07 = "downstream07";
    private static final String DOWNSTREAM08 = "downstream08";
    private static final String DOWNSTREAM09 = "downstream09";
    private static final String DOWNSTREAM10 = "downstream10";
    private static final String ENV = "env";
    private static final String POC01 = "poc01";
    private static final String POC02 = "poc02";
    private static final String POC03 = "poc03";
    private static final String RELATEDLINK = "relatedlink";
    private static final String VIDEO = "video";
    private static final String APPLOGIN = "applogin";
    private static final String COMMENTTEXT = "commentText";

    private static final String INSERT_SYSTEM_QUERY = """
                                                      INSERT INTO wiki.system("systemId",
                                                             "systemName")
                                                      SELECT nextval('wiki."system_seq"'),
                                                             :systemName
                                                      RETURNING "systemId"
                                                      """;

    private static final String INSERT_APPLICATION_QUERY = """
                                                      INSERT INTO wiki.application("applicationId",
                                                             "applicationName",
                                                             "systemId")
                                                      SELECT nextval('wiki."application_seq"'),
                                                             :applicationName,
                                                             :systemId
                                                      RETURNING "applicationId"
                                                      """;

    private static final String INSERT_SYSTEM_ABOUT = """
            	INSERT INTO wiki.about("aboutId",
                        "about",
                        "systemId")
                SELECT nextval('wiki."about_seq"'),
                        :about,
                        :systemId
                """;

    private static final String INSERT_APPLICATION_ABOUT = """
            	INSERT INTO wiki.about("aboutId",
                        "about",
                        "applicationId")
                SELECT nextval('wiki."about_seq"'),
                        :about,
                        :applicationId
                """;

    private static final String INSERT_SYSTEM_HIGHLIGHT = """
            	INSERT INTO wiki.highlight("highlightId",
                        "highlight",
                        "systemId")
                SELECT nextval('wiki."highlight_seq"'),
                        :highlight,
                        :systemId
                """;

    private static final String INSERT_APPLICATION_HIGHLIGHT = """
            	INSERT INTO wiki.highlight("highlightId",
                        "highlight",
                        "applicationId")
                SELECT nextval('wiki."highlight_seq"'),
                        :highlight,
                        :applicationId
                """;

    private static final String INSERT_APPLICATION_UPSTREAM = """
            	INSERT INTO wiki.upstream("upstreamId",
                        "upstream01",
                        "upstream02",
                        "upstream03",
                        "upstream04",
                        "upstream05",
                        "upstream06",
                        "upstream07",
                        "upstream08",
                        "upstream09",
                        "upstream10",
                        "applicationId")
                SELECT nextval('wiki."upstream_seq"'),
                        :upstream01,
                        :upstream02,
                        :upstream03,
                        :upstream04,
                        :upstream05,
                        :upstream06,
                        :upstream07,
                        :upstream08,
                        :upstream09,
                        :upstream10,
                        :applicationId
                """;

    private static final String INSERT_APPLICATION_DOWNSTREAM = """
            	INSERT INTO wiki.downstream("downstreamId",
                        "downstream01",
                        "downstream02",
                        "downstream03",
                        "downstream04",
                        "downstream05",
                        "downstream06",
                        "downstream07",
                        "downstream08",
                        "downstream09",
                        "downstream10",
                        "applicationId")
                SELECT nextval('wiki."downstream_seq"'),
                        :downstream01,
                        :downstream02,
                        :downstream03,
                        :downstream04,
                        :downstream05,
                        :downstream06,
                        :downstream07,
                        :downstream08,
                        :downstream09,
                        :downstream10,
                        :applicationId
                """;

    private static final String INSERT_APPLICATION_POC = """
            	INSERT INTO wiki.poc("pocId",
                        "env",
                        "poc01",
                        "poc02",
                        "poc03",
                        "applicationId")
                SELECT nextval('wiki."poc_seq"'),
                        :env,
                        :poc01,
                        :poc02,
                        :poc03,
                        :applicationId
                """;

    private static final String INSERT_APPLICATION_RELATEDLINK = """
            	INSERT INTO wiki.relatedlink("relatedlinkId",
                        "relatedlink",
                        "applicationId")
                SELECT nextval('wiki."relatedlink_seq"'),
                        :relatedlink,
                        :applicationId
                """;

    private static final String INSERT_APPLICATION_VIDEO = """
            	INSERT INTO wiki.video("videoId",
                        "video",
                        "applicationId")
                SELECT nextval('wiki."video_seq"'),
                        :video,
                        :applicationId
                """;

    private static final String INSERT_APPLICATION_APPLOGIN = """
            	INSERT INTO wiki.applogin("apploginId",
                        "applogin",
                        "applicationId")
                SELECT nextval('wiki."applogin_seq"'),
                        :applogin,
                        :applicationId
                """;

    private static final String INSERT_COMMENT = """
            	INSERT INTO wiki.comment("commentId",
                        "commentText")
                SELECT nextval('wiki."comment_seq"'),
                        :commentText
                """;

    @Autowired
    private DatabaseClient dbClient;

    @Autowired
    private PreDeleteHelper preDeleteHelper;

    // =================================================================================================================
    // Create: System
    // =================================================================================================================

    @Modifying
    @Transactional
    public Mono<Long> insertSystem(SystemDO systemDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_SYSTEM_QUERY))
                .bindIf(SYSTEM_NAME, systemDO.getSystemName(), String.class)

                .fetch()
                .one()
                .mapNotNull(row -> row.get(SYSTEM_ID))
                .cast(Integer.class)
                .map(Long::valueOf);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertSystemAbout(Long sysId, AboutDO aboutDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_SYSTEM_ABOUT))
                .bindIf(ABOUT, aboutDO.getAbout(), String.class)
                .bindIf(SYSTEM_ID, sysId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-system-about", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertSystemHighlight(Long sysId, HighlightDO highlightDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_SYSTEM_HIGHLIGHT))
                .bindIf(HIGHLIGHT, highlightDO.getHighlight(), String.class)
                .bindIf(SYSTEM_ID, sysId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-system-highlight", 1);
    }

    // =================================================================================================================
    // Create: Application
    // =================================================================================================================

    @Modifying
    @Transactional
    public Mono<Long> insertApplication(Long sysId, ApplicationDO applicationDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_QUERY))
                .bindIf(APPLICATION_NAME, applicationDO.getApplicationName(), String.class)
                .bindIf(SYSTEM_ID, sysId, Long.class)

                .fetch()
                .one()
                .mapNotNull(row -> row.get(APPLICATION_ID))
                .cast(Integer.class)
                .map(Long::valueOf);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationAbout(Long appId, AboutDO aboutDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_ABOUT))
                .bindIf(ABOUT, aboutDO.getAbout(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-about", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationHighlight(Long appId, HighlightDO highlightDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_HIGHLIGHT))
                .bindIf(HIGHLIGHT, highlightDO.getHighlight(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-highlight", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationUpstream(Long appId, UpstreamDO upstreamDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_UPSTREAM))
                .bindIf(UPSTREAM01, upstreamDO.getUpstream01(), String.class)
                .bindIf(UPSTREAM02, upstreamDO.getUpstream02(), String.class)
                .bindIf(UPSTREAM03, upstreamDO.getUpstream03(), String.class)
                .bindIf(UPSTREAM04, upstreamDO.getUpstream04(), String.class)
                .bindIf(UPSTREAM05, upstreamDO.getUpstream05(), String.class)
                .bindIf(UPSTREAM06, upstreamDO.getUpstream06(), String.class)
                .bindIf(UPSTREAM07, upstreamDO.getUpstream07(), String.class)
                .bindIf(UPSTREAM08, upstreamDO.getUpstream08(), String.class)
                .bindIf(UPSTREAM09, upstreamDO.getUpstream09(), String.class)
                .bindIf(UPSTREAM10, upstreamDO.getUpstream10(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-upstream", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationDownstream(Long appId, DownstreamDO downstreamDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_DOWNSTREAM))
                .bindIf(DOWNSTREAM01, downstreamDO.getDownstream01(), String.class)
                .bindIf(DOWNSTREAM02, downstreamDO.getDownstream02(), String.class)
                .bindIf(DOWNSTREAM03, downstreamDO.getDownstream03(), String.class)
                .bindIf(DOWNSTREAM04, downstreamDO.getDownstream04(), String.class)
                .bindIf(DOWNSTREAM05, downstreamDO.getDownstream05(), String.class)
                .bindIf(DOWNSTREAM06, downstreamDO.getDownstream06(), String.class)
                .bindIf(DOWNSTREAM07, downstreamDO.getDownstream07(), String.class)
                .bindIf(DOWNSTREAM08, downstreamDO.getDownstream08(), String.class)
                .bindIf(DOWNSTREAM09, downstreamDO.getDownstream09(), String.class)
                .bindIf(DOWNSTREAM10, downstreamDO.getDownstream10(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-downstream", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationPoc(Long appId, PocDO pocDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_POC))
                .bindIf(ENV, pocDO.getEnv(), String.class)
                .bindIf(POC01, pocDO.getPoc01(), String.class)
                .bindIf(POC02, pocDO.getPoc02(), String.class)
                .bindIf(POC03, pocDO.getPoc03(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-poc", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationRelatedlink(Long appId, RelatedlinkDO relatedlinkDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_RELATEDLINK))
                .bindIf(RELATEDLINK, relatedlinkDO.getRelatedlink(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-relatedlink", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationVideo(Long appId, VideoDO videoDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_VIDEO))
                .bindIf(VIDEO, videoDO.getVideo(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-video", 1);
    }

    @Modifying
    @Transactional
    public Mono<Void> insertApplicationApplogin(Long appId, ApploginDO apploginDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_APPLICATION_APPLOGIN))
                .bindIf(APPLOGIN, apploginDO.getApplogin(), String.class)
                .bindIf(APPLICATION_ID, appId, Long.class)

                .fetchAndValidateUpdatedRowCount("insert-application-applogin", 1);
    }

    // =================================================================================================================
    // Create: Comment
    // =================================================================================================================

    @Modifying
    @Transactional
    public Mono<Void> insertComment(CommentDO commentDO) {

        return new BindSpecHelper(dbClient.sql(INSERT_COMMENT))
                .bindIf(COMMENTTEXT, commentDO.getCommentText(), String.class)

                .fetchAndValidateUpdatedRowCount("insert-comment", 1);
    }

}
