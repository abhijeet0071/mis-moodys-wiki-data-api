package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Video {

	Long videoId;

	String video;

	Long applicationId;

}
