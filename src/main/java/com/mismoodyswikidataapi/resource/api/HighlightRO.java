package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class HighlightRO {

	Long highlightId;

	String highlight;

	Long applicationId;

	Long systemId;

}
