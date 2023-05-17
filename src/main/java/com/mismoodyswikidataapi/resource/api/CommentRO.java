package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CommentRO {

	Long commentId;

	String commentText;

}
