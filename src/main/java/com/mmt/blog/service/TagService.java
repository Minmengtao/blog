package com.mmt.blog.service;

import com.mmt.blog.entity.BlogTagCount;
import com.mmt.blog.util.PageQueryUtil;
import com.mmt.blog.util.PageResult;

import java.util.List;

/**
 * 描述文章标签
 * @author minmengtao
 * @date 2021-5-12
 */
public interface TagService {

    /**
     * 查询标签的分页数据
     * @param pageQueryUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageQueryUtil);

    int getTotalTags();

    /**
     * 查询标签的所有博客数据
     * @return
     */
    List<BlogTagCount> getBlogTagCountForIndex();
}
