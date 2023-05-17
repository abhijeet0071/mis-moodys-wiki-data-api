package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Techstack;
import com.mismoodyswikidataapi.resource.api.TechstackRO;
import org.mapstruct.Mapper;

@Mapper
public interface TechstackDelegateMapper {

	TechstackRO mapTechstackToTechstackRO(Techstack techstack);

	Techstack mapTechstackROToTechstack(TechstackRO techstackRO);

}
