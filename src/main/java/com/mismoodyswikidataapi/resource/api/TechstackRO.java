package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TechstackRO {

	Long techstackId;

	String frontend;

	String backend;

	String container;

	String cloud;

	String tool;

	String database;

	String other;

	Long applicationId;

}
