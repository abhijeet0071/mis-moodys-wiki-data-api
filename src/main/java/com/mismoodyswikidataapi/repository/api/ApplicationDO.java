package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class ApplicationDO {

	@Column("applicationId")
	Long applicationId;

	@Column("applicationName")
	String applicationName;

	@Column("systemId")
	Long systemId;

	@Column("systemName")
	String systemName;

}
