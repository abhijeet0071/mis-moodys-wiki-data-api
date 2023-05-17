package com.mismoodyswikidataapi.delegate;

import com.mismoodyswikidataapi.delegate.mappers.*;
import com.mismoodyswikidataapi.model.Application;
import com.mismoodyswikidataapi.model.System;
import com.mismoodyswikidataapi.resource.api.*;
import com.mismoodyswikidataapi.service.WikiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class WikiDelegate {

	private final WikiService wikiService;

	private final SystemDelegateMapper systemDelegateMapper;

	private final ApplicationDelegateMapper applicationDelegateMapper;

	private final AboutDelegateMapper aboutDelegateMapper;

	private final HighlightDelegateMapper highlightDelegateMapper;

	private final UpstreamDelegateMapper upstreamDelegateMapper;

	private final DownstreamDelegateMapper downstreamDelegateMapper;

	private final PocDelegateMapper pocDelegateMapper;

	private final RelatedlinkDelegateMapper relatedlinkDelegateMapper;

	private final VideoDelegateMapper videoDelegateMapper;

	private final ApploginDelegateMapper apploginDelegateMapper;

	private final ArchitectureDelegateMapper architectureDelegateMapper;

	private final CommentDelegateMapper commentDelegateMapper;

	private final TechstackDelegateMapper techstackDelegateMapper;

	private final SquadDelegateMapper squadDelegateMapper;

	private final DbdetailDelegateMapper dbdetailDelegateMapper;

	private final ChecklistDelegateMapper checklistDelegateMapper;

	// =================================================================================================================
	// Systems (Consolidated Object)
	// =================================================================================================================

	public Flux<SystemRO> retrieveSystems() {

		Function<System, Mono<System>> mapElementsToSystem = this::getSystemMono;

		return wikiService.retrieveSystems()
				.flatMapSequential(mapElementsToSystem)
				.map(systemDelegateMapper::mapSystemToSystemRO);
	}

	private Mono<System> getSystemMono(System system) {

		System.SystemBuilder systemBuilder = system.toBuilder();

		Mono<Void> aboutMono = wikiService.retrieveAboutBySysId(system.getSystemId())
				.map(systemBuilder::about)
				.then();

		Mono<Void> highlightsMono = wikiService.retrieveHighlightBySysId(system.getSystemId())
				.collectList()
				.map(systemBuilder::highlights)
				.then();

		Mono<Void> applicationsMono = wikiService.retrieveApplicationBySysId(system.getSystemId())
				.collectList()
				.map(systemBuilder::applications)
				.then();

		return Mono.when(aboutMono, highlightsMono, applicationsMono)
				.thenReturn(systemBuilder)
				.map(System.SystemBuilder::build);
	}

	// =================================================================================================================
	// Applications (Consolidated Object)
	// =================================================================================================================

	public Mono<ApplicationRO> retrieveApplicationByAppId(Long appId) {

		Function<Application, Mono<Application>> mapElementsToApplication = this::getApplicationMono;

		return wikiService.retrieveApplicationByAppId(appId)
				.flatMapSequential(mapElementsToApplication)
				.map(applicationDelegateMapper::mapApplicationToApplicationRO)
				.singleOrEmpty();
	}

	private Mono<Application> getApplicationMono(Application application) {

		Application.ApplicationBuilder applicationBuilder = application.toBuilder();

		Mono<Void> aboutMono = wikiService.retrieveAboutByAppId(application.getApplicationId())
				.map(applicationBuilder::about)
				.then();

		Mono<Void> highlightsMono = wikiService.retrieveHighlightByAppId(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::highlights)
				.then();

		Mono<Void> upstreamMono = wikiService.retrieveUpstream(application.getApplicationId())
				.map(applicationBuilder::upstream)
				.then();

		Mono<Void> downstreamMono = wikiService.retrieveDownstream(application.getApplicationId())
				.map(applicationBuilder::downstream)
				.then();

		Mono<Void> pocsMono = wikiService.retrievePoc(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::pocs)
				.then();

		Mono<Void> relatedlinksMono = wikiService.retrieveRelatedlink(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::relatedlinks)
				.then();

		Mono<Void> videosMono = wikiService.retrieveVideo(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::videos)
				.then();

		Mono<Void> apploginsMono = wikiService.retrieveApplogin(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::applogins)
				.then();

		Mono<Void> architecturesMono = wikiService.retrieveArchitecture(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::architectures)
				.then();

		Mono<Void> techstacksMono = wikiService.retrieveTechstack(application.getApplicationId())
				.map(applicationBuilder::techstack)
				.then();

		Mono<Void> squadMono = wikiService.retrieveSquad(application.getApplicationId())
				.map(applicationBuilder::squad)
				.then();

		Mono<Void> dbdetailsMono = wikiService.retrieveDbdetail(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::dbdetails)
				.then();

		Mono<Void> checklistsMono = wikiService.retrieveChecklist(application.getApplicationId())
				.collectList()
				.map(applicationBuilder::checklists)
				.then();

		return Mono.when(aboutMono, highlightsMono, upstreamMono, downstreamMono, pocsMono, relatedlinksMono, videosMono,
						apploginsMono, architecturesMono, techstacksMono, squadMono, dbdetailsMono, checklistsMono)
				.thenReturn(applicationBuilder)
				.map(Application.ApplicationBuilder::build);
	}

	public Mono<ApplicationRO> retrieveApplicationByAppName(String appName) {

		return wikiService.retrieveApplicationByAppName(appName)
				.map(applicationDelegateMapper::mapApplicationToApplicationRO);
	}

	// =================================================================================================================
	// About
	// =================================================================================================================

	public Flux<AboutRO> retrieveAboutBySysId(Long sysId) {

		return wikiService.retrieveAboutBySysId(sysId)
				.map(aboutDelegateMapper::mapAboutToAboutRO);
	}

	public Flux<AboutRO> retrieveAboutByAppId(Long appId) {

		return wikiService.retrieveAboutByAppId(appId)
				.map(aboutDelegateMapper::mapAboutToAboutRO);
	}

	// =================================================================================================================
	// Highlights
	// =================================================================================================================

	public Flux<HighlightRO> retrieveHighlightBySysId(Long sysId) {

		return wikiService.retrieveHighlightBySysId(sysId)
				.map(highlightDelegateMapper::mapHighlightToHighlightRO);
	}

	public Flux<HighlightRO> retrieveHighlightByAppId(Long appId) {

		return wikiService.retrieveHighlightByAppId(appId)
				.map(highlightDelegateMapper::mapHighlightToHighlightRO);
	}

	// =================================================================================================================
	// Upstream
	// =================================================================================================================

	public Mono<UpstreamRO> retrieveUpstream(Long appId) {

		return wikiService.retrieveUpstream(appId)
				.map(upstreamDelegateMapper::mapUpstreamToUpstreamRO);
	}

	// =================================================================================================================
	// Downstream
	// =================================================================================================================

	public Mono<DownstreamRO> retrieveDownstream(Long appId) {

		return wikiService.retrieveDownstream(appId)
				.map(downstreamDelegateMapper::mapDownstreamToDownstreamRO);
	}

	// =================================================================================================================
	// Point of Contact
	// =================================================================================================================

	public Flux<PocRO> retrievePoc(Long appId) {

		return wikiService.retrievePoc(appId)
				.map(pocDelegateMapper::mapPocToPocRO);
	}

	// =================================================================================================================
	// Related Links
	// =================================================================================================================

	public Flux<RelatedlinkRO> retrieveRelatedlink(Long appId) {

		return wikiService.retrieveRelatedlink(appId)
				.map(relatedlinkDelegateMapper::mapRelatedlinkToRelatedlinkRO);
	}

	// =================================================================================================================
	// Video
	// =================================================================================================================

	public Flux<VideoRO> retrieveVideo(Long appId) {

		return wikiService.retrieveVideo(appId)
				.map(videoDelegateMapper::mapVideoToVideoRO);
	}

	// =================================================================================================================
	// App Login
	// =================================================================================================================

	public Flux<ApploginRO> retrieveApplogin(Long appId) {

		return wikiService.retrieveApplogin(appId)
				.map(apploginDelegateMapper::mapApploginToApploginRO);
	}

	// =================================================================================================================
	// Comment
	// =================================================================================================================

	public Flux<CommentRO> retrieveComments() {

		return wikiService.retrieveComments()
				.map(commentDelegateMapper::mapCommentToCommentRO);
	}

	// =================================================================================================================
	// Architecture
	// =================================================================================================================

	public Flux<ArchitectureRO> retrieveArchitecture(Long appId) {

		return wikiService.retrieveArchitecture(appId)
				.map(architectureDelegateMapper::mapArchitectureToArchitectureRO);
	}

	// =================================================================================================================
	// Techstack
	// =================================================================================================================
	
	public Mono<TechstackRO> retrieveTechstack(Long appId) {

		return wikiService.retrieveTechstack(appId)
				.map(techstackDelegateMapper::mapTechstackToTechstackRO);

	}

	// =================================================================================================================
	// Squad
	// =================================================================================================================
	
	public Mono<SquadRO> retrieveSquad(Long appId) {

		return wikiService.retrieveSquad(appId)
				.map(squadDelegateMapper::mapSquadToSquadRO);

	}

	// =================================================================================================================
	// Dbdetail
	// =================================================================================================================
	
	public Flux<DbdetailRO> retrieveDbdetail(Long appId) {

		return wikiService.retrieveDbdetail(appId)
				.map(dbdetailDelegateMapper::mapDbdetailToDbdetailRO);

	}

	// =================================================================================================================
	// Checklist
	// =================================================================================================================

	public Flux<ChecklistRO> retrieveChecklist(Long appId) {

		return wikiService.retrieveChecklist(appId)
				.map(checklistDelegateMapper::mapChecklistToChecklistRO);

	}
	
	// =================================================================================================================
	// Create: System
	// =================================================================================================================

	public Mono<SystemRO> createSystem(Mono<SystemRO> systemROMono) {

		return systemROMono.map(systemDelegateMapper::mapSystemROToSystem)
				.as(system -> wikiService.createSystem(system))
				.map(systemDelegateMapper::mapSystemToSystemRO);
	}

	// =================================================================================================================
	// Create: Application
	// =================================================================================================================

	public Mono<ApplicationRO> createApplication(Long sysId, Mono<ApplicationRO> applicationROMono) {

		return applicationROMono.map(applicationDelegateMapper::mapApplicationROToApplication)
				.as(application -> wikiService.createApplication(sysId, application))
				.map(applicationDelegateMapper::mapApplicationToApplicationRO);
	}

	// =================================================================================================================
	// Create: Comment
	// =================================================================================================================

	public Mono<Void> createComment(Mono<CommentRO> commentROMono) {

		return commentROMono.map(commentDelegateMapper::mapCommentROToComment)
				.as(comment -> wikiService.createComment(comment));
	}

}
