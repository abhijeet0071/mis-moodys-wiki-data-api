package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class ArchitectureDO {

	@Column("architectureId")
	Long architectureId;

	@Column("image")
	String image;

	@Column("applicationId")
	Long applicationId;

}
