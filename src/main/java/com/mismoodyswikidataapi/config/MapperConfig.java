package com.mismoodyswikidataapi.config;

import com.mismoodyswikidataapi.delegate.mappers.*;
import com.mismoodyswikidataapi.service.mappers.*;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

	@Bean
	public SystemDelegateMapper systemDelegateMapper() {

		return Mappers.getMapper(SystemDelegateMapper.class);
	}

	@Bean
	public SystemServiceMapper systemServiceMapper() {

		return Mappers.getMapper(SystemServiceMapper.class);
	}

	@Bean
	public ApplicationDelegateMapper applicationDelegateMapper() {

		return Mappers.getMapper(ApplicationDelegateMapper.class);
	}

	@Bean
	public ApplicationServiceMapper applicationServiceMapper() {

		return Mappers.getMapper(ApplicationServiceMapper.class);
	}

	@Bean
	public AboutDelegateMapper aboutDelegateMapper() {

		return Mappers.getMapper(AboutDelegateMapper.class);
	}

	@Bean
	public AboutServiceMapper aboutServiceMapper() {

		return Mappers.getMapper(AboutServiceMapper.class);
	}

	@Bean
	public HighlightDelegateMapper highlightDelegateMapper() {

		return Mappers.getMapper(HighlightDelegateMapper.class);
	}

	@Bean
	public HighlightServiceMapper highlightServiceMapper() {

		return Mappers.getMapper(HighlightServiceMapper.class);
	}

	@Bean
	public UpstreamDelegateMapper upstreamDelegateMapper() {

		return Mappers.getMapper(UpstreamDelegateMapper.class);
	}

	@Bean
	public UpstreamServiceMapper upstreamServiceMapper() {

		return Mappers.getMapper(UpstreamServiceMapper.class);
	}

	@Bean
	public DownstreamDelegateMapper downstreamDelegateMapper() {

		return Mappers.getMapper(DownstreamDelegateMapper.class);
	}

	@Bean
	public DownstreamServiceMapper downstreamServiceMapper() {

		return Mappers.getMapper(DownstreamServiceMapper.class);
	}

	@Bean
	public PocDelegateMapper pocDelegateMapper() {

		return Mappers.getMapper(PocDelegateMapper.class);
	}

	@Bean
	public PocServiceMapper pocServiceMapper() {

		return Mappers.getMapper(PocServiceMapper.class);
	}

	@Bean
	public RelatedlinkDelegateMapper relatedlinkDelegateMapper() {

		return Mappers.getMapper(RelatedlinkDelegateMapper.class);
	}

	@Bean
	public RelatedlinkServiceMapper relatedlinkServiceMapper() {

		return Mappers.getMapper(RelatedlinkServiceMapper.class);
	}

	@Bean
	public VideoDelegateMapper videoDelegateMapper() {

		return Mappers.getMapper(VideoDelegateMapper.class);
	}

	@Bean
	public VideoServiceMapper videoServiceMapper() {

		return Mappers.getMapper(VideoServiceMapper.class);
	}

	@Bean
	public ApploginDelegateMapper apploginDelegateMapper() {

		return Mappers.getMapper(ApploginDelegateMapper.class);
	}

	@Bean
	public ApploginServiceMapper apploginServiceMapper() {

		return Mappers.getMapper(ApploginServiceMapper.class);
	}

	@Bean
	public CommentDelegateMapper commentDelegateMapper() {

		return Mappers.getMapper(CommentDelegateMapper.class);
	}

	@Bean
	public CommentServiceMapper commentServiceMapper() {

		return Mappers.getMapper(CommentServiceMapper.class);
	}

	@Bean
	public ArchitectureDelegateMapper architectureDelegateMapper() {

		return Mappers.getMapper(ArchitectureDelegateMapper.class);
	}

	@Bean
	public ArchitectureServiceMapper architectureServiceMapper() {

		return Mappers.getMapper(ArchitectureServiceMapper.class);
	}

	@Bean
	public TechstackDelegateMapper techstackDelegateMapper() {

		return Mappers.getMapper(TechstackDelegateMapper.class);
	}

	@Bean
	public TechstackServiceMapper techstackServiceMapper() {

		return Mappers.getMapper(TechstackServiceMapper.class);
	}

	@Bean
	public SquadDelegateMapper squadDelegateMapper() {

		return Mappers.getMapper(SquadDelegateMapper.class);
	}

	@Bean
	public SquadServiceMapper squadServiceMapper() {

		return Mappers.getMapper(SquadServiceMapper.class);
	}

	@Bean
	public DbdetailDelegateMapper dbdetailDelegateMapper() {

		return Mappers.getMapper(DbdetailDelegateMapper.class);
	}

	@Bean
	public DbdetailServiceMapper dbdetailServiceMapper() {

		return Mappers.getMapper(DbdetailServiceMapper.class);
	}

	@Bean
	public ChecklistDelegateMapper checklistDelegateMapper() {

		return Mappers.getMapper(ChecklistDelegateMapper.class);
	}

	@Bean
	public ChecklistServiceMapper checklistServiceMapper() {

		return Mappers.getMapper(ChecklistServiceMapper.class);
	}

}
