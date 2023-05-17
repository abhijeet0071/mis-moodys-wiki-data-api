package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Poc {

	Long pocId;

	String env;
	
	String poc01;
	
	String poc02;
	
	String poc03;

	Long applicationId;

}
