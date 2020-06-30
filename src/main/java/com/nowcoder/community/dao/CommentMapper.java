package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;

import java.util.List;

public interface CommentMapper {

    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);
    int selectCountByEntity(int entityType, int entityId);
}
