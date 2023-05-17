package com.mismoodyswikidataapi.delegate.mappers;

import com.mismoodyswikidataapi.model.System;
import com.mismoodyswikidataapi.resource.api.*;
import org.mapstruct.Mapper;

@Mapper
public interface SystemDelegateMapper {

	SystemRO mapSystemToSystemRO(System system);

	System mapSystemROToSystem(SystemRO systemRO);

}
