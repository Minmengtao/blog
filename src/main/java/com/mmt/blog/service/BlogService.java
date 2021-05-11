package com.mmt.blog.service;

import com.mmt.blog.controller.vo.SimpleBlogListVO;
import com.mmt.blog.util.PageQueryUtil;
import com.mmt.blog.util.PageResult;

import java.util.List;

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

    /**
     * 首页侧边栏数据列表
     * 0-点击最多 1-最新发布
     * @param type
     * @return
     */
    List<SimpleBlogListVO> getBlogListForIndexPage(int type);
}
