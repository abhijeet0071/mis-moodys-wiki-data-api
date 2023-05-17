package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Dbdetail;
import com.mismoodyswikidataapi.repository.api.DbdetailDO;
import org.mapstruct.Mapper;

@Mapper(uses = { DbdetailServiceMapper.class })
public interface DbdetailServiceMapper {

	Dbdetail mapDbdetailDOToDbdetail(DbdetailDO dbdetailDO);

	DbdetailDO mapDbdetailToDbdetailDO(Dbdetail dbdetail);

}
