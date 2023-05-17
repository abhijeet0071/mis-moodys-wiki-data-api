package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Poc;
import com.mismoodyswikidataapi.repository.api.PocDO;
import org.mapstruct.Mapper;

@Mapper(uses = { PocServiceMapper.class })
public interface PocServiceMapper {

	Poc mapPocDOToPoc(PocDO pocDO);

	PocDO mapPocToPocDO(Poc poc);

}
