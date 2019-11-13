package com.weison.mapper;

import java.util.List;
import java.util.Map;

import com.weison.entity.BlogType;

/**
 * @author weison
 *
 */
public interface BlogTypeMapper {

    List<BlogType> getBlogTypeData();

    BlogType findById(Integer id);

    List<BlogType> listBlogType(Map<String, Object> map);

    Long getTotal(Map<String, Object> map);

    Integer addBlogType(BlogType blogType);

    Integer updateBlogType(BlogType blogType);

    Integer deleteBlogType(Integer id);

}
