package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Relatedlink;
import com.mismoodyswikidataapi.repository.api.RelatedlinkDO;
import org.mapstruct.Mapper;

@Mapper(uses = { RelatedlinkServiceMapper.class })
public interface RelatedlinkServiceMapper {

	Relatedlink mapRelatedlinkDOToRelatedlink(RelatedlinkDO relatedlinkDO);

	RelatedlinkDO mapRelatedlinkToRelatedlinkDO(Relatedlink relatedlink);

}
