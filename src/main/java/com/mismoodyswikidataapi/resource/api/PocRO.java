package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PocRO {

	Long pocId;

	String env;

	String poc01;

	String poc02;

	String poc03;

	Long applicationId;

}
