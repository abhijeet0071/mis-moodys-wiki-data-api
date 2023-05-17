package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class RelatedlinkRO {

	Long relatedlinkId;

	String relatedlink;

	Long applicationId;

}
