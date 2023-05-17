package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.System;
import com.mismoodyswikidataapi.repository.api.SystemDO;
import org.mapstruct.Mapper;

@Mapper(uses = { SystemServiceMapper.class })
public interface SystemServiceMapper {

	System mapSystemDOToSystem(SystemDO systemDO);

	SystemDO mapSystemToSystemDO(System system);

}
