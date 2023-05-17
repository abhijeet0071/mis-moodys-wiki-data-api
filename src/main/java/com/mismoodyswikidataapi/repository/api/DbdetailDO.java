package com.mismoodyswikidataapi.repository.api;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.relational.core.mapping.Column;

@Value
@Builder
public class DbdetailDO {

	@Column("dbDetailId")
	Long dbDetailId;

	@Column("env")
	String env;

	@Column("url")
	String url;

	@Column("userName")
	String userName;

	@Column("sslMode")
	String sslMode;

	@Column("applicationId")
	Long applicationId;

}
