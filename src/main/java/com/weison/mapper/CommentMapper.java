package com.weison.mapper;

import java.util.List;
import java.util.Map;

import com.weison.entity.Comment;

/**
 * @author weison
 *
 */
public interface CommentMapper {

    List<Comment> getCommentData(Map<String, Object> map);

    int addComment(Comment comment);

    Long getTotal(Map<String, Object> map);

    Integer update(Comment comment);

    Integer deleteComment(Integer id);

    Integer deleteCommentByBlogId(Integer blogId);
}
