package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Relatedlink;
import com.mismoodyswikidataapi.resource.api.RelatedlinkRO;
import org.mapstruct.Mapper;

@Mapper
public interface RelatedlinkDelegateMapper {

	RelatedlinkRO mapRelatedlinkToRelatedlinkRO(Relatedlink relatedlink);

	Relatedlink mapRelatedlinkROToRelatedlink(RelatedlinkRO relatedlinkRO);

}
