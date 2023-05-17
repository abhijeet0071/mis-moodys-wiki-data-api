package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Architecture;
import com.mismoodyswikidataapi.repository.api.ArchitectureDO;
import org.mapstruct.Mapper;

@Mapper(uses = { ArchitectureServiceMapper.class })
public interface ArchitectureServiceMapper {

	Architecture mapArchitectureDOToArchitecture(ArchitectureDO architectureDO);

	ArchitectureDO mapArchitectureToArchitectureDO(Architecture architecture);

}
