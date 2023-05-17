package com.mismoodyswikidataapi.repository.helpers;

import com.mismoodyswikidataapi.repository.api.AuditInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;


@Component
public class PreDeleteHelper {

	public static final String AUDIT_WHO = "AUDIT_WHO";
	public static final String AUDIT_WHEN = "AUDIT_WHEN";
	@Autowired
	private DatabaseClient databaseClient;

	public Mono<Void> runPreDelete(AuditInfoDO auditInfoDO, String tableName) {

		var tempTableName = String.format("%s_temp", tableName);
		var createSql = String.format("CREATE TEMP TABLE IF NOT EXISTS %s (user_logon_nm varchar(50), curnt_dtm timestamp with time zone)", tempTableName);
		var insertSql = String.format("INSERT INTO %s (user_logon_nm, curnt_dtm) VALUES (:AUDIT_WHO, :AUDIT_WHEN)", tempTableName);

		Mono<Void> tempTableMono = this.databaseClient
				.sql(insertSql)
				.bind(AUDIT_WHO, auditInfoDO.getWho())
				.bind(AUDIT_WHEN, auditInfoDO.getWhen())
				.fetch()
				.rowsUpdated()
				.then();


		return this.databaseClient
				.sql(createSql)
				.fetch()
				.rowsUpdated()
				.then(tempTableMono);
	}

}