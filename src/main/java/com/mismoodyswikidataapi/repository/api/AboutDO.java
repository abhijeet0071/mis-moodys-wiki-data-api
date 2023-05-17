package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class AboutDO {

	@Column("aboutId")
	Long aboutId;

	@Column("about")
	String about;

	@Column("applicationId")
	Long applicationId;

	@Column("systemId")
	Long systemId;

}
