package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ChecklistRO {

	Long checklistId;

	String checklist;

	Long applicationId;

}
