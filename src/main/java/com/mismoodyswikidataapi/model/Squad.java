package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Squad {

	Long squadId;

	String squadName01;

	String squadName02;

	String squadName03;

	String squadName04;

	String squadName05;

	String productOwner;

	String jiraLink;

	Long applicationId;

}
