package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class VideoRO {

	Long videoId;

	String video;

	Long applicationId;

}
