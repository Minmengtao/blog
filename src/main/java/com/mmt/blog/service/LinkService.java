package com.mmt.blog.service;

import com.mmt.blog.entity.BlogLink;

import java.util.List;
import java.util.Map;

/**
 * @author: minmengtao
 * @date: 2021/5/22
 * @description:
 */
public interface LinkService {
    /**
     * 返回友链页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
