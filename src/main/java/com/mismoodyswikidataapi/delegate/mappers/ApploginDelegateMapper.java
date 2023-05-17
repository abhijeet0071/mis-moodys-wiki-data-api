package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Applogin;
import com.mismoodyswikidataapi.resource.api.ApploginRO;
import org.mapstruct.Mapper;

@Mapper
public interface ApploginDelegateMapper {

	ApploginRO mapApploginToApploginRO(Applogin applogin);

	Applogin mapApploginROToApplogin(ApploginRO apploginRO);

}
