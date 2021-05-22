package com.mmt.blog.service;

import com.mmt.blog.controller.vo.BlogDetailVO;
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

    /**
     * 文章详情
     *
     * @param blogId
     * @return
     */
    BlogDetailVO getBlogDetail(Long blogId);

    /**
     * 根据标签获取文章列表
     *
     * @param tagName
     * @param page
     * @return
     */
    PageResult getBlogsPageByTag(String tagName, int page);

    /**
     * 根据分类获取文章列表
     *
     * @param categoryName
     * @param page
     * @return
     */
    PageResult getBlogsPageByCategory(String categoryName, int page);

    /**
     * 根据搜索获取文章列表
     *
     * @param keyword
     * @param page
     * @return
     */
    PageResult getBlogsPageBySearch(String keyword, int page);

    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
