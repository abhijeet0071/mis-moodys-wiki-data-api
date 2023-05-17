package com.mismoodyswikidataapi.repository;

import com.mismoodyswikidataapi.repository.api.*;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface WikiRepository extends ReactiveCrudRepository<SystemDO, Long> {

	final class Queries {

		private static final String SELECT_QUERY_SYSTEMS = """
														  SELECT system.* 
														  FROM wiki.system system 
														  ORDER BY system."systemId"
														  """;

		private static final String SELECT_QUERY_SPECIFIC_SYSTEM = """
																   SELECT system.* 
																   FROM wiki.system system
																   """;

		private static final String SELECT_QUERY_APPLICATIONS = """
																SELECT application.*, system."systemName"
				                                                FROM wiki.application application
				                                                INNER JOIN wiki.system system
				                                                ON application."systemId" = system."systemId"
															    """;

		private static final String SELECT_QUERY_APPLICATION_BY_APPLICATIONNAME = """
																				  SELECT application.*
																				  FROM wiki.application application
																				  """;

		private static final String SELECT_QUERY_APPLICATION = """
																SELECT application.*
				                                                FROM wiki.application application
															    """;

		private static final String ORDER_BY_APPLICATIONID = """
															 Order By application."applicationId"
															 """;

		private static final String SELECT_QUERY_ABOUT_BY_SYSID = """
																  SELECT about.*
																  FROM wiki.about about
																  INNER JOIN wiki.system system
																  ON about."systemId" = system."systemId"
																   """;

		private static final String SELECT_QUERY_ABOUT_BY_APPID = """
																  SELECT about.*
				                                                  FROM wiki.about about
				                                                  INNER JOIN wiki.application application
				                                                  ON about."applicationId" = application."applicationId"
															      """;

		private static final String ORDER_BY_ABOUTID = """
													   Order By about."aboutId"
													   """;

		private static final String SELECT_QUERY_HIGHLIGHT_BY_SYSID = """
																	  SELECT highlight.*
																	  FROM wiki.highlight highlight
																	  INNER JOIN wiki.system system
																	  ON highlight."systemId" = system."systemId"
																      """;

		private static final String SELECT_QUERY_HIGHLIGHT_BY_APPID = """
																	  SELECT highlight.*
																	  FROM wiki.highlight highlight
																	  INNER JOIN wiki.application application
																	  ON highlight."applicationId" = application."applicationId"
																      """;

		private static final String ORDER_BY_HIGHLIGHTID = """
														   Order By highlight."highlightId"
														   """;

		private static final String SELECT_QUERY_UPSTREAM = """
															SELECT upstream.*
															FROM wiki.upstream upstream
															INNER JOIN wiki.application application
															ON upstream."applicationId" = application."applicationId"
															""";

		private static final String SELECT_QUERY_DOWNSTREAM = """
															  SELECT downstream.*
															  FROM wiki.downstream downstream
															  INNER JOIN wiki.application application
															  ON downstream."applicationId" = application."applicationId"
															  """;

		private static final String SELECT_QUERY_POC = """
													   SELECT poc.*
													   FROM wiki.poc poc
													   INNER JOIN wiki.application application
													   ON poc."applicationId" = application."applicationId"
													   """;

		private static final String ORDER_BY_POCID = """
													 Order By poc."pocId"
													 """;

		private static final String SELECT_QUERY_RELATEDLINK = """
															   SELECT relatedlink.*
															   FROM wiki.relatedlink relatedlink
															   INNER JOIN wiki.application application
															   ON relatedlink."applicationId" = application."applicationId"
															   """;

		private static final String ORDER_BY_RELATEDLINKID = """
															 Order By relatedlink."relatedlinkId"
													 		 """;

		private static final String SELECT_QUERY_VIDEO = """
													     SELECT video.*
													     FROM wiki.video video
													     INNER JOIN wiki.application application
													     ON video."applicationId" = application."applicationId"
													     """;

		private static final String ORDER_BY_VIDEOID = """
													   Order By video."videoId"
													   """;

		private static final String SELECT_QUERY_APPLOGIN = """
														    SELECT applogin.*
														    FROM wiki.applogin applogin
														    INNER JOIN wiki.application application
														    ON applogin."applicationId" = application."applicationId"
														    """;

		private static final String ORDER_BY_APPLOGINID = """
														  Order By applogin."apploginId"
														  """;

		private static final String SELECT_QUERY_COMMENT = """
														   SELECT comment.*
														   FROM wiki.comment comment
														   """;

		private static final String ORDER_BY_COMMENTID = """
														 Order By comment."commentId"
														 """;

		private static final String SELECT_QUERY_ARCHITECTURE = """
															    SELECT architecture.*
															    FROM wiki.architecture architecture
															    INNER JOIN wiki.application application
														    	ON architecture."applicationId" = application."applicationId"
															    """;

		private static final String ORDER_BY_ARCHITECTUREID = """
															  Order By architecture."architectureId"
															  """;

		private static final String SELECT_QUERY_TECHSTACK = """
															 SELECT techstack.*
															 FROM wiki.techstack techstack
															 INNER JOIN wiki.application application
															 ON techstack."applicationId" = application."applicationId"
															 """;

		private static final String SELECT_QUERY_SQUAD= """
														SELECT squad.*
														FROM wiki.squad squad
														INNER JOIN wiki.application application
														ON squad."applicationId" = application."applicationId"
														""";

		private static final String SELECT_QUERY_DBDETAIL = """
															SELECT dbdetail.*
															FROM wiki.dbdetail dbdetail
															INNER JOIN wiki.application application
															ON dbdetail."applicationId" = application."applicationId"
															""";

		private static final String ORDER_BY_DBDETAILID = """
															  Order By dbdetail."dbDetailId"
															  """;

		private static final String SELECT_QUERY_CHECKLIST = """
															 SELECT checklist.*
															 FROM wiki.checklist checklist
															 INNER JOIN wiki.application application
															 ON checklist."applicationId" = application."applicationId"
															 """;

		private static final String ORDER_BY_CHECKLISTID = """
															  Order By checklist."checklistId"
															  """;

		private Queries() {

		}

	}

	@Query(Queries.SELECT_QUERY_SYSTEMS)
	Flux<SystemDO> retrieveSystems();

	@Query(Queries.SELECT_QUERY_SPECIFIC_SYSTEM + " WHERE system.\"systemId\" = :sysId ")
	Mono<SystemDO> retrieveSystem(Long sysId);

	@Query(Queries.SELECT_QUERY_APPLICATIONS + " AND application.\"systemId\" = :sysId " + Queries.ORDER_BY_APPLICATIONID)
	Flux<ApplicationDO> retrieveApplicationBySysId(Long sysId);

	@Query(Queries.SELECT_QUERY_APPLICATIONS + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_APPLICATIONID)
	Flux<ApplicationDO> retrieveApplicationByAppId(Long appId);

	@Query(Queries.SELECT_QUERY_APPLICATION_BY_APPLICATIONNAME + " WHERE application.\"applicationName\" = :appName ")
	Mono<ApplicationDO> retrieveApplicationByAppName(String appName);

	@Query(Queries.SELECT_QUERY_APPLICATION + " WHERE application.\"applicationId\" = :appId ")
	Mono<ApplicationDO> retrieveNewApplication(Long appId);

	@Query(Queries.SELECT_QUERY_ABOUT_BY_SYSID + " AND system.\"systemId\" = :sysId " + Queries.ORDER_BY_ABOUTID)
	Flux<AboutDO> retrieveAboutBySysId(Long sysId);

	@Query(Queries.SELECT_QUERY_ABOUT_BY_APPID + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_ABOUTID)
	Flux<AboutDO> retrieveAboutByAppId(Long appId);

	@Query(Queries.SELECT_QUERY_HIGHLIGHT_BY_SYSID + " AND system.\"systemId\" = :sysId " + Queries.ORDER_BY_HIGHLIGHTID)
	Flux<HighlightDO> retrieveHighlightBySysId(Long sysId);

	@Query(Queries.SELECT_QUERY_HIGHLIGHT_BY_APPID + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_HIGHLIGHTID)
	Flux<HighlightDO> retrieveHighlightByAppId(Long appId);

	@Query(Queries.SELECT_QUERY_UPSTREAM + " And application.\"applicationId\" = :appId ")
	Mono<UpstreamDO> retrieveUpstream(Long appId);

	@Query(Queries.SELECT_QUERY_DOWNSTREAM + " And application.\"applicationId\" = :appId ")
	Mono<DownstreamDO> retrieveDownstream(Long appId);

	@Query(Queries.SELECT_QUERY_POC + " And application.\"applicationId\" = :appId " + Queries.ORDER_BY_POCID)
	Flux<PocDO> retrievePoc(Long appId);

	@Query(Queries.SELECT_QUERY_RELATEDLINK + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_RELATEDLINKID)
	Flux<RelatedlinkDO> retrieveRelatedlink(Long appId);

	@Query(Queries.SELECT_QUERY_VIDEO + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_VIDEOID)
	Flux<VideoDO> retrieveVideo(Long appId);

	@Query(Queries.SELECT_QUERY_APPLOGIN + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_APPLOGINID)
	Flux<ApploginDO> retrieveApplogin(Long appId);

	@Query(Queries.SELECT_QUERY_COMMENT + Queries.ORDER_BY_COMMENTID)
	Flux<CommentDO> retrieveComments();

	@Query(Queries.SELECT_QUERY_ARCHITECTURE + " AND application.\"applicationId\" = :appId " + Queries.ORDER_BY_ARCHITECTUREID)
	Flux<ArchitectureDO> retrieveArchitecture(Long appId);

	@Query(Queries.SELECT_QUERY_TECHSTACK + " And application.\"applicationId\" = :appId ")
	Mono<TechstackDO> retrieveTechstack(Long appId);

	@Query(Queries.SELECT_QUERY_SQUAD + " And application.\"applicationId\" = :appId ")
	Mono<SquadDO> retrieveSquad(Long appId);

	@Query(Queries.SELECT_QUERY_DBDETAIL + " And application.\"applicationId\" = :appId "  + Queries.ORDER_BY_DBDETAILID)
	Flux<DbdetailDO> retrieveDbdetail(Long appId);

	@Query(Queries.SELECT_QUERY_CHECKLIST + " And application.\"applicationId\" = :appId "  + Queries.ORDER_BY_CHECKLISTID)
	Flux<ChecklistDO> retrieveChecklist(Long appId);

}
