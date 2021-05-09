package com.mmt.blog.service;

import com.mmt.blog.util.PageQueryUtil;
import com.mmt.blog.util.PageResult;

/**
 * @author minmengtao
 * @date 2020-5-8
 */
public interface BlogService {
    PageResult getBlogsPage(PageQueryUtil pageUtil);

    /**
     * 获取首页文章列表
     * @param page
     * @return
     */
    PageResult getBlogsForIndexPage(int page);
}
