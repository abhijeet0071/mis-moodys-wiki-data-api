package com.mismoodyswikidataapi.service.mappers;

import com.mismoodyswikidataapi.model.Comment;
import com.mismoodyswikidataapi.repository.api.CommentDO;
import org.mapstruct.Mapper;

@Mapper(uses = { CommentServiceMapper.class })
public interface CommentServiceMapper {

	Comment mapCommentDOToComment(CommentDO commentDO);

	CommentDO mapCommentToCommentDO(Comment comment);

}
