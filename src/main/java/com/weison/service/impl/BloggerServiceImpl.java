package com.weison.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weison.mapper.BloggerMapper;
import com.weison.entity.Blogger;
import com.weison.service.BloggerService;

/**
 * @author weison
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

    @Resource
    private BloggerMapper bloggerMapper;

    public Blogger getByUsername(String username) {
        return bloggerMapper.getByUsername(username);
    }

    public Blogger getBloggerData() {
        return bloggerMapper.getBloggerData();
    }

    public Integer updateBlogger(Blogger blogger) {
        return bloggerMapper.updateBlogger(blogger);
    }

}
