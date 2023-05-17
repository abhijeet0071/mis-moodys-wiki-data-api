package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Application;
import com.mismoodyswikidataapi.repository.api.ApplicationDO;
import org.mapstruct.Mapper;

@Mapper(uses = { ApplicationServiceMapper.class })
public interface ApplicationServiceMapper {

	Application mapApplicationDOToApplication(ApplicationDO applicationDO);

	ApplicationDO mapApplicationToApplicationDO(Application application);

}
