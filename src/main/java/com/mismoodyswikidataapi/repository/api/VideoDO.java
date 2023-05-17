package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class VideoDO {

	@Column("videoId")
	Long videoId;

	@Column("video")
	String video;

	@Column("applicationId")
	Long applicationId;

}
