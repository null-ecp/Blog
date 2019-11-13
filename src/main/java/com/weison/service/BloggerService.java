package com.weison.service;

import com.weison.entity.Blogger;

/**
 *
 * @author weison
 *
 */
public interface BloggerService {

    Blogger getByUsername(String username);

    Blogger getBloggerData();

    Integer updateBlogger(Blogger blogger);
}
