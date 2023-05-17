package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Application;
import com.mismoodyswikidataapi.resource.api.ApplicationRO;
import org.mapstruct.Mapper;

@Mapper
public interface ApplicationDelegateMapper {

	ApplicationRO mapApplicationToApplicationRO(Application application);

	Application mapApplicationROToApplication(ApplicationRO applicationRO);

}
