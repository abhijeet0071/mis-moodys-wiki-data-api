package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Techstack;
import com.mismoodyswikidataapi.repository.api.TechstackDO;
import org.mapstruct.Mapper;

@Mapper(uses = { TechstackServiceMapper.class })
public interface TechstackServiceMapper {

	Techstack mapTechstackDOToTechstack(TechstackDO techstackDO);

	TechstackDO mapTechstackToTechstackDO(Techstack techstack);

}
