package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Video;
import com.mismoodyswikidataapi.repository.api.VideoDO;
import org.mapstruct.Mapper;

@Mapper(uses = { VideoServiceMapper.class })
public interface VideoServiceMapper {

	Video mapVideoDOToVideo(VideoDO videoDO);

	VideoDO mapVideoToVideoDO(Video video);

}
