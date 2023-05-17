package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Techstack {

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
