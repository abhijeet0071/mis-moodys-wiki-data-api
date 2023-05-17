package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class TechstackDO {

	@Column("techstackId")
	Long techstackId;

	@Column("frontend")
	String frontend;

	@Column("backend")
	String backend;

	@Column("container")
	String container;

	@Column("cloud")
	String cloud;

	@Column("tool")
	String tool;

	@Column("database")
	String database;

	@Column("other")
	String other;

	@Column("applicationId")
	Long applicationId;

}
