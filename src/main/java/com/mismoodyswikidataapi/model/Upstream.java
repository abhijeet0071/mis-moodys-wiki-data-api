package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Upstream {

	Long upstreamId;

	String upstream01;

	String upstream02;

	String upstream03;

	String upstream04;

	String upstream05;

	String upstream06;

	String upstream07;

	String upstream08;

	String upstream09;

	String upstream10;

	Long applicationId;

}
