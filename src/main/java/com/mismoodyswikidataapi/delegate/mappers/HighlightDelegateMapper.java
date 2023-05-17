package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Highlight;
import com.mismoodyswikidataapi.resource.api.HighlightRO;
import org.mapstruct.Mapper;

@Mapper
public interface HighlightDelegateMapper {

	HighlightRO mapHighlightToHighlightRO(Highlight highlight);

	Highlight mapHighlightROToHighlight(HighlightRO highlightRO);

}
