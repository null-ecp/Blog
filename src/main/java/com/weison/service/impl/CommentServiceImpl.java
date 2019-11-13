package com.weison.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weison.mapper.CommentMapper;
import com.weison.entity.Comment;
import com.weison.service.CommentService;

/**
 * @author weison
 *
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    public List<Comment> getCommentData(Map<String, Object> map) {
        return commentMapper.getCommentData(map);
    }

    public int addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    public Long getTotal(Map<String, Object> map) {
        return commentMapper.getTotal(map);
    }

    public Integer update(Comment comment) {
        return commentMapper.update(comment);
    }

    public Integer deleteComment(Integer id) {
        return commentMapper.deleteComment(id);
    }

    public Integer deleteCommentByBlogId(Integer blogId) {
        return commentMapper.deleteCommentByBlogId(blogId);
    }

}
