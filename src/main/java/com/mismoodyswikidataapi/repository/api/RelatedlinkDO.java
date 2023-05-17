package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class RelatedlinkDO {

	@Column("relatedlinkId")
	Long relatedlinkId;

	@Column("relatedlink")
	String relatedlink;

	@Column("applicationId")
	Long applicationId;

}
