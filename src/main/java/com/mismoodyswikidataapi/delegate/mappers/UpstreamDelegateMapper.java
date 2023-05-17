package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Upstream;
import com.mismoodyswikidataapi.resource.api.UpstreamRO;
import org.mapstruct.Mapper;

@Mapper
public interface UpstreamDelegateMapper {

	UpstreamRO mapUpstreamToUpstreamRO(Upstream upstream);

	Upstream mapUpstreamROToUpstream(UpstreamRO upstreamRO);

}
