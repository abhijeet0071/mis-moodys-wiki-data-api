package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class DownstreamDO {

	@Column("downstreamId")
	Long downstreamId;

	@Column("downstream01")
	String downstream01;

	@Column("downstream02")
	String downstream02;

	@Column("downstream03")
	String downstream03;

	@Column("downstream04")
	String downstream04;

	@Column("downstream05")
	String downstream05;

	@Column("downstream06")
	String downstream06;

	@Column("downstream07")
	String downstream07;

	@Column("downstream08")
	String downstream08;

	@Column("downstream09")
	String downstream09;

	@Column("downstream10")
	String downstream10;

	@Column("applicationId")
	Long applicationId;

}
