package com.mismoodyswikidataapi.resource.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DbdetailRO {

	Long dbDetailId;

	String env;

	String url;

	String userName;

	String sslMode;

	Long applicationId;

}
