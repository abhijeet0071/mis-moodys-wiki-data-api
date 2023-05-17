package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AboutRO {

	Long aboutId;

	String about;

	Long applicationId;

	Long systemId;

}
