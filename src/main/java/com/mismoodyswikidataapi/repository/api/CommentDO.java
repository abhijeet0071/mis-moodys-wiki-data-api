package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class CommentDO {

	@Column("commentId")
	Long commentId;

	@Column("commentText")
	String commentText;

}
