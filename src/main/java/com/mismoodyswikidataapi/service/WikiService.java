package com.mismoodyswikidataapi.service;

import com.mismoodyswikidataapi.model.*;
import com.mismoodyswikidataapi.model.System;
import com.mismoodyswikidataapi.repository.WikiRepository;
import com.mismoodyswikidataapi.repository.WikiUpdateRepository;
import com.mismoodyswikidataapi.repository.api.*;
import com.mismoodyswikidataapi.resource.api.*;
import com.mismoodyswikidataapi.service.mappers.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikiService {

	private final WikiRepository wikiRepository;

	private final SystemServiceMapper systemServiceMapper;

	private final ApplicationServiceMapper applicationServiceMapper;

	private final AboutServiceMapper aboutServiceMapper;

	private final HighlightServiceMapper highlightServiceMapper;

	private final UpstreamServiceMapper upstreamServiceMapper;

	private final DownstreamServiceMapper downstreamServiceMapper;

	private final PocServiceMapper pocServiceMapper;

	private final RelatedlinkServiceMapper relatedlinkServiceMapper;

	private final VideoServiceMapper videoServiceMapper;

	private final ApploginServiceMapper apploginServiceMapper;

	private final CommentServiceMapper commentServiceMapper;

	private final ArchitectureServiceMapper architectureServiceMapper;

	private final TechstackServiceMapper techstackServiceMapper;

	private final SquadServiceMapper squadServiceMapper;

	private final DbdetailServiceMapper dbdetailServiceMapper;

	private final ChecklistServiceMapper checklistServiceMapper;

	private final WikiUpdateRepository wikiUpdateRepository;

	// =================================================================================================================
	// Systems
	// =================================================================================================================

	public Flux<System> retrieveSystems() {

		return wikiRepository.retrieveSystems()
				.map(systemServiceMapper::mapSystemDOToSystem);
	}

	// =================================================================================================================
	// Applications
	// =================================================================================================================

	public Flux<Application> retrieveApplicationBySysId(Long sysId) {

		return wikiRepository.retrieveApplicationBySysId(sysId)
				.map(applicationServiceMapper::mapApplicationDOToApplication);
	}
	public Flux<Application> retrieveApplicationByAppId(Long appId) {

		return wikiRepository.retrieveApplicationByAppId(appId)
				.map(applicationServiceMapper::mapApplicationDOToApplication);
	}

	public Mono<Application> retrieveApplicationByAppName(String appName) {

		return wikiRepository.retrieveApplicationByAppName(appName)
				.map(applicationServiceMapper::mapApplicationDOToApplication);
	}

	// =================================================================================================================
	// About
	// =================================================================================================================

	public Flux<About> retrieveAboutBySysId(Long sysId) {

		return wikiRepository.retrieveAboutBySysId(sysId)
				.map(aboutServiceMapper::mapAboutDOToAbout);
	}

	public Flux<About> retrieveAboutByAppId(Long appId) {

		return wikiRepository.retrieveAboutByAppId(appId)
				.map(aboutServiceMapper::mapAboutDOToAbout);
	}

	// =================================================================================================================
	// Highlights
	// =================================================================================================================

	public Flux<Highlight> retrieveHighlightBySysId(Long sysId) {

		return wikiRepository.retrieveHighlightBySysId(sysId)
				.map(highlightServiceMapper::mapHighlightDOToHighlight);
	}

	public Flux<Highlight> retrieveHighlightByAppId(Long appId) {

		return wikiRepository.retrieveHighlightByAppId(appId)
				.map(highlightServiceMapper::mapHighlightDOToHighlight);
	}

	// =================================================================================================================
	// Upstream
	// =================================================================================================================

	public Mono<Upstream> retrieveUpstream(Long appId) {

		return wikiRepository.retrieveUpstream(appId)
				.map(upstreamServiceMapper::mapUpstreamDOToUpstream);
	}

	// =================================================================================================================
	// Downstream
	// =================================================================================================================

	public Mono<Downstream> retrieveDownstream(Long appId) {

		return wikiRepository.retrieveDownstream(appId)
				.map(downstreamServiceMapper::mapDownstreamDOToDownstream);
	}

	// =================================================================================================================
	// Point of Contact
	// =================================================================================================================

	public Flux<Poc> retrievePoc(Long appId) {

		return wikiRepository.retrievePoc(appId)
				.map(pocServiceMapper::mapPocDOToPoc);
	}

	// =================================================================================================================
	// Related Links
	// =================================================================================================================

	public Flux<Relatedlink> retrieveRelatedlink(Long appId) {

		return wikiRepository.retrieveRelatedlink(appId)
				.map(relatedlinkServiceMapper::mapRelatedlinkDOToRelatedlink);
	}

	// =================================================================================================================
	// Video
	// =================================================================================================================

	public Flux<Video> retrieveVideo(Long appId) {

		return wikiRepository.retrieveVideo(appId)
				.map(videoServiceMapper::mapVideoDOToVideo);
	}

	// =================================================================================================================
	// App Login
	// =================================================================================================================

	public Flux<Applogin> retrieveApplogin(Long appId) {

		return wikiRepository.retrieveApplogin(appId)
				.map(apploginServiceMapper::mapApploginDOToApplogin);
	}

	// =================================================================================================================
	// Comment
	// =================================================================================================================

	public Flux<Comment> retrieveComments() {

		return wikiRepository.retrieveComments()
				.map(commentServiceMapper::mapCommentDOToComment);
	}

	// =================================================================================================================
	// Architecture
	// =================================================================================================================

	public Flux<Architecture> retrieveArchitecture(Long appId) {

		return wikiRepository.retrieveArchitecture(appId)
				.map(architectureServiceMapper::mapArchitectureDOToArchitecture);
	}

	// =================================================================================================================
	// Techstack
	// =================================================================================================================

	public Mono<Techstack> retrieveTechstack(Long appId) {

		return wikiRepository.retrieveTechstack(appId)
				.map(techstackServiceMapper::mapTechstackDOToTechstack);

	}

	// =================================================================================================================
	// Squad
	// =================================================================================================================

	public Mono<Squad> retrieveSquad(Long appId) {

		return wikiRepository.retrieveSquad(appId)
				.map(squadServiceMapper::mapSquadDOToSquad);

	}

	// =================================================================================================================
	// Dbdetail
	// =================================================================================================================

	public Flux<Dbdetail> retrieveDbdetail(Long appId) {

		return wikiRepository.retrieveDbdetail(appId)
				.map(dbdetailServiceMapper::mapDbdetailDOToDbdetail);

	}

	// =================================================================================================================
	// Checklist
	// =================================================================================================================

	public Flux<Checklist> retrieveChecklist(Long appId) {

		return wikiRepository.retrieveChecklist(appId)
				.map(checklistServiceMapper::mapChecklistDOToChecklist);

	}

	// =================================================================================================================
	// Create: System
	// =================================================================================================================

	public Mono<System> createSystem(Mono<System> system) {

		Mono<System> cachedSystem = system.cache();

		Mono<About> about = cachedSystem
				.map(System::getAbout);

		Flux<Highlight> highlights = cachedSystem
				.map(System::getHighlights)
				.flatMapMany(Flux::fromIterable);

		return cachedSystem.map(systemServiceMapper::mapSystemToSystemDO)
				.flatMap(systemDO -> wikiUpdateRepository.insertSystem(systemDO)
						.flatMap(sysId -> this.updateSystemsAboutAndHighlight(sysId, highlights, about)
								.then(this.retrieveSystem(sysId))));
	}

	public Mono<Void> updateSystemsAboutAndHighlight(Long sysId, Flux<Highlight> highlightFlux, Mono<About> aboutMono) {

		Mono<AboutDO> aboutDOFluxCache = aboutMono
				.map(aboutServiceMapper::mapAboutToAboutDO)
				.cache();

		Flux<HighlightDO> highlightDOFluxCache = highlightFlux
				.map(highlightServiceMapper::mapHighlightToHighlightDO)
				.cache();

		return aboutMono
				.then(aboutDOFluxCache)
				.flatMap(aboutDO -> wikiUpdateRepository.insertSystemAbout(sysId, aboutDO))
				.thenMany(highlightFlux)
				.thenMany(highlightDOFluxCache)
				.flatMap(highEntityDO -> wikiUpdateRepository.insertSystemHighlight(sysId, highEntityDO))
				.then();
	}

	public Mono<System> retrieveSystem(Long sysId) {

		return wikiRepository.retrieveSystem(sysId)
				.map(systemServiceMapper::mapSystemDOToSystem);
	}

	// =================================================================================================================
	// Create: Application
	// =================================================================================================================

	public Mono<Application> createApplication(Long sysId, Mono<Application> application) {

		Mono<Application> cachedApplication = application.cache();

		Mono<About> about = cachedApplication
				.map(Application::getAbout);

		Flux<Highlight> highlights = cachedApplication
				.map(Application::getHighlights)
				.flatMapMany(Flux::fromIterable);

		Mono<Upstream> upstream = cachedApplication
				.map(Application::getUpstream);

		Mono<Downstream> downstream = cachedApplication
				.map(Application::getDownstream);

		Flux<Poc> pocs = cachedApplication
				.map(Application::getPocs)
				.flatMapMany(Flux::fromIterable);

		Flux<Relatedlink> relatedlinks = cachedApplication
				.map(Application::getRelatedlinks)
				.flatMapMany(Flux::fromIterable);

		Flux<Video> videos = cachedApplication
				.map(Application::getVideos)
				.flatMapMany(Flux::fromIterable);

		Flux<Applogin> applogins = cachedApplication
				.map(Application::getApplogins)
				.flatMapMany(Flux::fromIterable);

		return cachedApplication.map(applicationServiceMapper::mapApplicationToApplicationDO)
				.flatMap(applicationDO -> wikiUpdateRepository.insertApplication(sysId, applicationDO)
						.flatMap(appId -> this.updateApplicationsContent(appId, about, highlights, upstream, downstream, pocs, relatedlinks, videos, applogins)
								.then(this.retrieveNewApplication(appId))));
	}

	public Mono<Void> updateApplicationsContent(Long appId, Mono<About> aboutMono, Flux<Highlight> highlightFlux,
												Mono<Upstream> upstreamMono, Mono<Downstream> downstreamMono,
												Flux<Poc> pocFlux, Flux<Relatedlink> relatedlinkFlux,
												Flux<Video> videoFlux, Flux<Applogin> apploginFlux) {

		Mono<AboutDO> aboutDOFluxCache = aboutMono
				.map(aboutServiceMapper::mapAboutToAboutDO)
				.cache();

		Flux<HighlightDO> highlightDOFluxCache = highlightFlux
				.map(highlightServiceMapper::mapHighlightToHighlightDO)
				.cache();

		Mono<UpstreamDO> upstreamDOFluxCache = upstreamMono
				.map(upstreamServiceMapper::mapUpstreamToUpstreamDO)
				.cache();

		Mono<DownstreamDO> downstreamDOFluxCache = downstreamMono
				.map(downstreamServiceMapper::mapDownstreamToDownstreamDO)
				.cache();

		Flux<PocDO> pocDOFluxCache = pocFlux
				.map(pocServiceMapper::mapPocToPocDO)
				.cache();

		Flux<RelatedlinkDO> relatedlinkDOFluxCache = relatedlinkFlux
				.map(relatedlinkServiceMapper::mapRelatedlinkToRelatedlinkDO)
				.cache();

		Flux<VideoDO> videoDOFluxCache = videoFlux
				.map(videoServiceMapper::mapVideoToVideoDO)
				.cache();

		Flux<ApploginDO> apploginDOFluxCache = apploginFlux
				.map(apploginServiceMapper::mapApploginToApploginDO)
				.cache();

		return aboutMono
				.then(aboutDOFluxCache)
				.flatMap(aboutDO -> wikiUpdateRepository.insertApplicationAbout(appId, aboutDO))
				.thenMany(highlightFlux)
				.thenMany(highlightDOFluxCache)
				.flatMap(highlightDO -> wikiUpdateRepository.insertApplicationHighlight(appId, highlightDO))
				.then(upstreamMono)
				.then(upstreamDOFluxCache)
				.flatMap(upstreamDO -> wikiUpdateRepository.insertApplicationUpstream(appId, upstreamDO))
				.then(downstreamMono)
				.then(downstreamDOFluxCache)
				.flatMap(downstreamDO -> wikiUpdateRepository.insertApplicationDownstream(appId, downstreamDO))
				.thenMany(pocFlux)
				.thenMany(pocDOFluxCache)
				.flatMap(pocDO -> wikiUpdateRepository.insertApplicationPoc(appId, pocDO))
				.thenMany(relatedlinkFlux)
				.thenMany(relatedlinkDOFluxCache)
				.flatMap(relatedlinkDO -> wikiUpdateRepository.insertApplicationRelatedlink(appId, relatedlinkDO))
				.thenMany(videoFlux)
				.thenMany(videoDOFluxCache)
				.flatMap(videoDO -> wikiUpdateRepository.insertApplicationVideo(appId, videoDO))
				.thenMany(apploginFlux)
				.thenMany(apploginDOFluxCache)
				.flatMap(apploginDO -> wikiUpdateRepository.insertApplicationApplogin(appId, apploginDO))
				.then();
	}

	public Mono<Application> retrieveNewApplication(Long appId) {

		return wikiRepository.retrieveNewApplication(appId)
				.map(applicationServiceMapper::mapApplicationDOToApplication);
	}

	// =================================================================================================================
	// Create: Comment
	// =================================================================================================================

	public Mono<Void> createComment(Mono<Comment> comment) {

		Mono<Comment> cachedComment = comment.cache();

		return cachedComment.map(commentServiceMapper::mapCommentToCommentDO)
				.flatMap(commentDO -> wikiUpdateRepository.insertComment(commentDO))
						.then();

	}

}
