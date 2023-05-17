package com.mismoodyswikidataapi.delegate.mappers;


import com.mismoodyswikidataapi.model.Comment;
import com.mismoodyswikidataapi.resource.api.CommentRO;
import org.mapstruct.Mapper;

@Mapper
public interface CommentDelegateMapper {

	CommentRO mapCommentToCommentRO(Comment comment);

	Comment mapCommentROToComment(CommentRO commentRO);

}
