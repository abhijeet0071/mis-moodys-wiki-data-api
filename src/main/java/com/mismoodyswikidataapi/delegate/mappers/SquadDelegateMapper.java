package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Squad;
import com.mismoodyswikidataapi.resource.api.SquadRO;
import org.mapstruct.Mapper;

@Mapper
public interface SquadDelegateMapper {

	SquadRO mapSquadToSquadRO(Squad squad);

	Squad mapSquadROToSquad(SquadRO squadRO);

}
