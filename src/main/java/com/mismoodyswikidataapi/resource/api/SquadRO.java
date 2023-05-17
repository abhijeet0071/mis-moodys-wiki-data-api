package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SquadRO {

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
