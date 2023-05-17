package com.mismoodyswikidataapi.resource;

import com.mismoodyswikidataapi.delegate.WikiDelegate;
import com.mismoodyswikidataapi.resource.api.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wiki")
@CrossOrigin(origins = "http://localhost:4200")
public class WikiController {

	private final WikiDelegate wikiDelegate;

	// =================================================================================================================
	// Systems
	// =================================================================================================================

	@GetMapping(path = "/systems")
	public Flux<SystemRO> retrieveSystems() {

		return wikiDelegate.retrieveSystems();

	}

	// =================================================================================================================
	// Applications
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}")
	public Mono<ApplicationRO> retrieveApplicationByAppId(@PathVariable Long appId) {

		return wikiDelegate.retrieveApplicationByAppId(appId);

	}

	@GetMapping(path = "/application")
	public Mono<ApplicationRO> retrieveApplicationByAppName(@RequestParam(value="appName") String appName) {

		return wikiDelegate.retrieveApplicationByAppName(appName);

	}

	// =================================================================================================================
	// About
	// =================================================================================================================

	@GetMapping(path = "/system/{sysId}/about")
	public Flux<AboutRO> retrieveAboutBySysId(@PathVariable Long sysId) {

		return wikiDelegate.retrieveAboutBySysId(sysId);

	}

	@GetMapping(path = "/application/{appId}/about")
	public Flux<AboutRO> retrieveAboutByAppId(@PathVariable Long appId) {

		return wikiDelegate.retrieveAboutByAppId(appId);

	}

	// =================================================================================================================
	// Highlights
	// =================================================================================================================

	@GetMapping(path = "/system/{sysId}/highlight")
	public Flux<HighlightRO> retrieveHighlightBySysId(@PathVariable Long sysId) {

		return wikiDelegate.retrieveHighlightBySysId(sysId);

	}

	@GetMapping(path = "/application/{appId}/highlight")
	public Flux<HighlightRO> retrieveHighlightByAppId(@PathVariable Long appId) {

		return wikiDelegate.retrieveHighlightByAppId(appId);

	}

	// =================================================================================================================
	// Upstream
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/upstream")
	public Mono<UpstreamRO> retrieveUpstream(@PathVariable Long appId) {

		return wikiDelegate.retrieveUpstream(appId);

	}

	// =================================================================================================================
	// Downstream
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/downstream")
	public Mono<DownstreamRO> retrieveDownstream(@PathVariable Long appId) {

		return wikiDelegate.retrieveDownstream(appId);

	}

	// =================================================================================================================
	// Point of Contact
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/poc")
	public Flux<PocRO> retrievePoc(@PathVariable Long appId) {

		return wikiDelegate.retrievePoc(appId);
	}

	// =================================================================================================================
	// Related Links
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/relatedlink")
	public Flux<RelatedlinkRO> retrieveRelatedlink(@PathVariable Long appId) {

		return wikiDelegate.retrieveRelatedlink(appId);

	}

	// =================================================================================================================
	// Video
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/video")
	public Flux<VideoRO> retrieveVideo(@PathVariable Long appId) {

		return wikiDelegate.retrieveVideo(appId);

	}

	// =================================================================================================================
	// App Login
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/applogin")
	public Flux<ApploginRO> retrieveApplogin(@PathVariable Long appId) {

		return wikiDelegate.retrieveApplogin(appId);

	}

	// =================================================================================================================
	// Comment
	// =================================================================================================================

	@GetMapping(path = "/comments")
	public Flux<CommentRO> retrieveComments() {

		return wikiDelegate.retrieveComments();

	}

	// =================================================================================================================
	// Architecture
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/architecture")
	public Flux<ArchitectureRO> retrieveArchitecture(@PathVariable Long appId) {

		return wikiDelegate.retrieveArchitecture(appId);

	}

	// =================================================================================================================
	// Techstack
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/techstack")
	public Mono<TechstackRO> retrieveTechstack(@PathVariable Long appId) {

		return wikiDelegate.retrieveTechstack(appId);

	}

	// =================================================================================================================
	// Squad
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/squad")
	public Mono<SquadRO> retrieveSquad(@PathVariable Long appId) {

		return wikiDelegate.retrieveSquad(appId);

	}

	// =================================================================================================================
	// Dbdetail
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/dbdetail")
	public Flux<DbdetailRO> retrieveDbdetail(@PathVariable Long appId) {

		return wikiDelegate.retrieveDbdetail(appId);

	}

	// =================================================================================================================
	// Checklist
	// =================================================================================================================

	@GetMapping(path = "/application/{appId}/checklist")
	public Flux<ChecklistRO> retrieveChecklist(@PathVariable Long appId) {

		return wikiDelegate.retrieveChecklist(appId);

	}

	// =================================================================================================================
	// Create: System
	// =================================================================================================================

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path = "/newsys")
	public Mono<SystemRO> createSystem(@RequestBody Mono<SystemRO> systemROMono) {

		return wikiDelegate.createSystem(systemROMono);

	}

	// =================================================================================================================
	// Create: Application
	// =================================================================================================================

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path = "system/{sysId}/newapp")
	public Mono<ApplicationRO> createApplication(@PathVariable Long sysId, @RequestBody Mono<ApplicationRO> applicationROMono) {

		return wikiDelegate.createApplication(sysId, applicationROMono);

	}

	// =================================================================================================================
	// Create: Comment
	// =================================================================================================================

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path = "comment")
	public Mono<Void> createComment(@RequestBody Mono<CommentRO> commentROMono) {

		return wikiDelegate.createComment(commentROMono);

	}

}
