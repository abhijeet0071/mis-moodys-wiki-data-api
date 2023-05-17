package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Video;
import com.mismoodyswikidataapi.resource.api.VideoRO;
import org.mapstruct.Mapper;

@Mapper
public interface VideoDelegateMapper {

	VideoRO mapVideoToVideoRO(Video video);

	Video mapVideoROToVideo(VideoRO videoRO);

}
