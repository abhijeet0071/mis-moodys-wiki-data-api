package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Highlight;
import com.mismoodyswikidataapi.repository.api.HighlightDO;
import org.mapstruct.Mapper;

@Mapper(uses = { HighlightServiceMapper.class })
public interface HighlightServiceMapper {

	Highlight mapHighlightDOToHighlight(HighlightDO highlightDO);

	HighlightDO mapHighlightToHighlightDO(Highlight highlight);

}
