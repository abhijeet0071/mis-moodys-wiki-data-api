package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ApploginRO {

	Long apploginId;

	String applogin;

	Long applicationId;

}
