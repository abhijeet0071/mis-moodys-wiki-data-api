package com.mismoodyswikidataapi.repository.api;

import lombok.Data;

import java.time.OffsetDateTime;


@Data
public class AuditInfoDO {

	private final String who;

	private final OffsetDateTime when;
}
