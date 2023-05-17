package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.About;
import com.mismoodyswikidataapi.resource.api.AboutRO;
import org.mapstruct.Mapper;

@Mapper
public interface AboutDelegateMapper {

	AboutRO mapAboutToAboutRO(About about);

	About mapAboutROToAbout(AboutRO aboutRO);

}
