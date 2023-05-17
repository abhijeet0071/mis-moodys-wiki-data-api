package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class UpstreamDO {

	@Column("upstreamId")
	Long upstreamId;

	@Column("upstream01")
	String upstream01;

	@Column("upstream02")
	String upstream02;

	@Column("upstream03")
	String upstream03;

	@Column("upstream04")
	String upstream04;

	@Column("upstream05")
	String upstream05;

	@Column("upstream06")
	String upstream06;

	@Column("upstream07")
	String upstream07;

	@Column("upstream08")
	String upstream08;

	@Column("upstream09")
	String upstream09;

	@Column("upstream10")
	String upstream10;

	@Column("applicationId")
	Long applicationId;

}
