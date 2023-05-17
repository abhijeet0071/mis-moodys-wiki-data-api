package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Downstream;
import com.mismoodyswikidataapi.resource.api.DownstreamRO;
import org.mapstruct.Mapper;

@Mapper
public interface DownstreamDelegateMapper {

	DownstreamRO mapDownstreamToDownstreamRO(Downstream downstream);

	Downstream mapDownstreamROToDownstream(DownstreamRO downstreamRO);

}
