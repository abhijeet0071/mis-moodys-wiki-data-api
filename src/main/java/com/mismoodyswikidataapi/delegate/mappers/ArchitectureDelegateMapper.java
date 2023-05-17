package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Architecture;
import com.mismoodyswikidataapi.resource.api.ArchitectureRO;
import org.mapstruct.Mapper;

@Mapper
public interface ArchitectureDelegateMapper {

	ArchitectureRO mapArchitectureToArchitectureRO(Architecture architecture);

	Architecture mapArchitectureROToArchitecture(ArchitectureRO architectureRO);

}
