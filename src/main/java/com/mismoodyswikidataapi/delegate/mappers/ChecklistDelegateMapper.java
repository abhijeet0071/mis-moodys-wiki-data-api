package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Checklist;
import com.mismoodyswikidataapi.resource.api.ChecklistRO;
import org.mapstruct.Mapper;

@Mapper
public interface ChecklistDelegateMapper {

	ChecklistRO mapChecklistToChecklistRO(Checklist checklist);

	Checklist mapChecklistROToChecklist(ChecklistRO checklistRO);

}
