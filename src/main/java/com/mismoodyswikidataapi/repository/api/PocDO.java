package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class PocDO {

	@Column("pocId")
	Long pocId;

	@Column("env")
	String env;

	@Column("poc01")
	String poc01;

	@Column("poc02")
	String poc02;

	@Column("poc03")
	String poc03;

	@Column("applicationId")
	Long applicationId;

}
