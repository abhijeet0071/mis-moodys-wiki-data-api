package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Downstream;
import com.mismoodyswikidataapi.repository.api.DownstreamDO;
import org.mapstruct.Mapper;

@Mapper(uses = { DownstreamServiceMapper.class })
public interface DownstreamServiceMapper {

	Downstream mapDownstreamDOToDownstream(DownstreamDO downstreamDO);

	DownstreamDO mapDownstreamToDownstreamDO(Downstream downstream);

}
