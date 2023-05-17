package com.mismoodyswikidataapi.resource.api;

import com.mismoodyswikidataapi.model.About;
import com.mismoodyswikidataapi.model.Highlight;
import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class SystemRO {

	Long systemId;

	String systemName;

	About about;

	Collection<Highlight> highlights;

	Collection<ApplicationRO> applications;

}
