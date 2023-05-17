package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dbdetail {

	Long dbDetailId;

	String env;

	String url;

	String userName;

	String sslMode;

	Long applicationId;

}
