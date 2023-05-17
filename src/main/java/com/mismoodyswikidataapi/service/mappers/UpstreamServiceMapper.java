package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Upstream;
import com.mismoodyswikidataapi.repository.api.UpstreamDO;
import org.mapstruct.Mapper;

@Mapper(uses = { UpstreamServiceMapper.class })
public interface UpstreamServiceMapper {

	Upstream mapUpstreamDOToUpstream(UpstreamDO upstreamDO);

	UpstreamDO mapUpstreamToUpstreamDO(Upstream upstream);

}
