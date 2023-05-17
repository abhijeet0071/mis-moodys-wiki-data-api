package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Downstream {

	Long downstreamId;

	String downstream01;
	
	String downstream02;
	
	String downstream03;
	
	String downstream04;
	
	String downstream05;
	
	String downstream06;
	
	String downstream07;
	
	String downstream08;
	
	String downstream09;
	
	String downstream10;

	Long applicationId;

}
