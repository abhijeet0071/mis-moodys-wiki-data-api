package com.mismoodyswikidataapi.resource.api;

import com.mismoodyswikidataapi.model.*;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class ApplicationRO {

	Long applicationId;

	String applicationName;

	Long systemId;

	String systemName;

	About about;

	Collection<Highlight> highlights;

	Upstream upstream;

	Downstream downstream;

	Collection<Poc> pocs;

	Collection<Relatedlink> relatedlinks;

	Collection<Video> videos;

	Collection<Applogin> applogins;

	Collection<Architecture> architectures;

	Techstack techstack;

	Squad squad;

	Collection<Dbdetail> dbdetails;

	Collection<Checklist> checklists;

}
