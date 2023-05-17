package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.About;
import com.mismoodyswikidataapi.repository.api.AboutDO;
import org.mapstruct.Mapper;

@Mapper(uses = { AboutServiceMapper.class })
public interface AboutServiceMapper {

	About mapAboutDOToAbout(AboutDO aboutDO);

	AboutDO mapAboutToAboutDO(About about);

}
