package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Applogin;
import com.mismoodyswikidataapi.repository.api.ApploginDO;
import org.mapstruct.Mapper;

@Mapper(uses = { ApploginServiceMapper.class })
public interface ApploginServiceMapper {

	Applogin mapApploginDOToApplogin(ApploginDO apploginDO);

	ApploginDO mapApploginToApploginDO(Applogin applogin);

}
