package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Dbdetail;
import com.mismoodyswikidataapi.resource.api.DbdetailRO;
import org.mapstruct.Mapper;

@Mapper
public interface DbdetailDelegateMapper {

	DbdetailRO mapDbdetailToDbdetailRO(Dbdetail dbdetail);

	Dbdetail mapDbdetailROToDbdetail(DbdetailRO dbdetailRO);

}
