package com.weison.mapper;

import com.weison.entity.Blogger;

    /**
 * @author weison
 *
 */
public interface BloggerMapper {

    /**
     * 通过用户名查找用户
     * @param username
     * @return
     */
    Blogger getByUsername(String username);

    /**
     *
     * @return
     */
    Blogger getBloggerData();

    Integer updateBlogger(Blogger blogger);
}
