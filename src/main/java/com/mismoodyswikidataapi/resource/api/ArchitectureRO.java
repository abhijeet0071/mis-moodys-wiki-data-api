package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ArchitectureRO {

	Long architectureId;

	String image;

	Long applicationId;

}
