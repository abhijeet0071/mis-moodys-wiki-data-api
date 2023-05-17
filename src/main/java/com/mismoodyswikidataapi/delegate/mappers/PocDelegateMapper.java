package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Poc;
import com.mismoodyswikidataapi.resource.api.PocRO;
import org.mapstruct.Mapper;

@Mapper
public interface PocDelegateMapper {

	PocRO mapPocToPocRO(Poc poc);

	Poc mapPocROToPoc(PocRO pocRO);

}
