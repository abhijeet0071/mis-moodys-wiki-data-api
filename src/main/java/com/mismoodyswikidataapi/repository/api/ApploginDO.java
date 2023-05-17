package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class ApploginDO {

	@Column("apploginId")
	Long apploginId;

	@Column("applogin")
	String applogin;

	@Column("applicationId")
	Long applicationId;

}
