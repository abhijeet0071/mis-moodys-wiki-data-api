package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class HighlightDO {

	@Column("highlightId")
	Long highlightId;

	@Column("highlight")
	String highlight;

	@Column("applicationId")
	Long applicationId;

	@Column("systemId")
	Long systemId;

}
