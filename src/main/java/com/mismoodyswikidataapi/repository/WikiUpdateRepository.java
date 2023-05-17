package com.mismoodyswikidataapi.repository;

import com.mismoodyswikidataapi.repository.api.*;
import reactor.core.publisher.Mono;

public interface WikiUpdateRepository {

	// =================================================================================================================
	// Create: System
	// =================================================================================================================

	Mono<Long> insertSystem(SystemDO systemDO);

	Mono<Void> insertSystemAbout(Long sysId, AboutDO aboutDO);

	Mono<Void> insertSystemHighlight(Long sysId, HighlightDO highlightDO);

	// =================================================================================================================
	// Create: Application
	// =================================================================================================================

	Mono<Long> insertApplication(Long sysId, ApplicationDO applicationDO);

	Mono<Void> insertApplicationAbout(Long appId, AboutDO aboutDO);

	Mono<Void> insertApplicationHighlight(Long appId, HighlightDO highlightDO);

	Mono<Void> insertApplicationUpstream(Long appId, UpstreamDO upstreamDO);

	Mono<Void> insertApplicationDownstream(Long appId, DownstreamDO downstreamDO);

	Mono<Void> insertApplicationPoc(Long appId, PocDO pocDO);

	Mono<Void> insertApplicationRelatedlink(Long appId, RelatedlinkDO relatedlinkDO);

	Mono<Void> insertApplicationVideo(Long appId, VideoDO videoDO);

	Mono<Void> insertApplicationApplogin(Long appId, ApploginDO apploginDO);

	// =================================================================================================================
	// Create: Comment
	// =================================================================================================================

	Mono<Void> insertComment(CommentDO commentDO);

}
