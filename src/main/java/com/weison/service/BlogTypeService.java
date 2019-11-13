package com.weison.service;

import java.util.List;
import java.util.Map;

import com.weison.entity.BlogType;

/**
 *
 * @author weison
 *
 */
public interface BlogTypeService {

    public List<BlogType> getBlogTypeData();


    public List<BlogType> listBlogType(Map<String, Object> map);


    public Long getTotal(Map<String, Object> map);


    public Integer addBlogType(BlogType blogType);


    public Integer updateBlogType(BlogType blogType);


    public Integer deleteBlogType(Integer id);
}
