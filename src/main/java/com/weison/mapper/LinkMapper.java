package com.weison.mapper;

import java.util.List;
import java.util.Map;

import com.weison.entity.Link;

/**
 * @author weison
 *
 */
public interface LinkMapper {

    List<Link> getLinkData();

    List<Link> listLinkData(Map<String, Object> map);

    Long getTotal(Map<String, Object> map);

    Integer addLink(Link link);

    Integer updateLink(Link link);

    Integer deleteLink(Integer id);
}
