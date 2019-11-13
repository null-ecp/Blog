package com.weison.service;

import java.util.List;
import java.util.Map;

import com.weison.entity.Blog;

/**
 *
 * @author weison
 *
 */
public interface BlogService {
    List<Map<String, Object>> getBlogData();

    List<Blog> listBlog(Map<String, Object> map);

    Long getTotal(Map<String, Object> map);

    Blog findById(Integer id);

    Integer update(Blog blog);

    Blog getPrevBlog(Integer id);

    Blog getNextBlog(Integer id);

    Integer addBlog(Blog blog);

    Integer deleteBlog(Integer id);

    Integer getBlogByTypeId(Integer typeId);
}
