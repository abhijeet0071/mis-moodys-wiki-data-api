package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class SystemDO {

	@Column("systemId")
	Long systemId;

	@Column("systemName")
	String systemName;

}
