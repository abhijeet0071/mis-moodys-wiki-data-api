package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class ChecklistDO {

	@Column("checklistId")
	Long checklistId;

	@Column("checklist")
	String checklist;

	@Column("applicationId")
	Long applicationId;

}
