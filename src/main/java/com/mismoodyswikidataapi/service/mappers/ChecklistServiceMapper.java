package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Checklist;
import com.mismoodyswikidataapi.repository.api.ChecklistDO;
import org.mapstruct.Mapper;

@Mapper(uses = { ChecklistServiceMapper.class })
public interface ChecklistServiceMapper {

	Checklist mapChecklistDOToChecklist(ChecklistDO checklistDO);

	ChecklistDO mapChecklistToChecklistDO(Checklist checklist);

}
