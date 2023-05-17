package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class SquadDO {

	@Column("squadId")
	Long squadId;

	@Column("squadName01")
	String squadName01;

	@Column("squadName02")
	String squadName02;

	@Column("squadName03")
	String squadName03;

	@Column("squadName04")
	String squadName04;

	@Column("squadName05")
	String squadName05;

	@Column("productOwner")
	String productOwner;

	@Column("jiraLink")
	String jiraLink;

	@Column("applicationId")
	Long applicationId;

}
