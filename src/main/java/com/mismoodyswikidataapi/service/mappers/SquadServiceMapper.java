package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Squad;
import com.mismoodyswikidataapi.repository.api.SquadDO;
import org.mapstruct.Mapper;

@Mapper(uses = { SquadServiceMapper.class })
public interface SquadServiceMapper {

	Squad mapSquadDOToSquad(SquadDO squadDO);

	SquadDO mapSquadToSquadDO(Squad squad);

}
