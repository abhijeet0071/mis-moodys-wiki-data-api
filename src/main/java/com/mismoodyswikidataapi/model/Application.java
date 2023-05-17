package com.mismoodyswikidataapi.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.Value;

import java.util.Collection;

@Value
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Application {

	Long applicationId;

	String applicationName;

	Long systemId;

	About about;

	String systemName;

	@Singular(ignoreNullCollections = true)
	Collection<Highlight> highlights;

	Upstream upstream;

	Downstream downstream;

	@Singular(ignoreNullCollections = true)
	Collection<Poc> pocs;

	@Singular(ignoreNullCollections = true)
	Collection<Relatedlink> relatedlinks;

	@Singular(ignoreNullCollections = true)
	Collection<Video> videos;

	@Singular(ignoreNullCollections = true)
	Collection<Applogin> applogins;

	@Singular(ignoreNullCollections = true)
	Collection<Architecture> architectures;

	Techstack techstack;

	Squad squad;

	@Singular(ignoreNullCollections = true)
	Collection<Dbdetail> dbdetails;

	@Singular(ignoreNullCollections = true)
	Collection<Checklist> checklists;

}
