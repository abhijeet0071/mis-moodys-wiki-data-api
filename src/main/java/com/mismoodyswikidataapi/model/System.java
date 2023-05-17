package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.Value;

import java.util.Collection;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class System {

	Long systemId;

	String systemName;

	About about;

	@Singular(ignoreNullCollections = true)
	Collection<Highlight> highlights;

	@Singular(ignoreNullCollections = true)
	Collection<Application> applications;

}
