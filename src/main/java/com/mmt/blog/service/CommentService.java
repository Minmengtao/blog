package com.mmt.blog.service;

import com.mmt.blog.util.PageResult;

/**
 * @author: minmengtao
 * @date: 2021/5/21
 * @description:
 */
public interface CommentService {
    /**
     * 根据文章id和分页参数获取文章的评论列表
     *
     * @param blogId
     * @param page
     * @return
     */
    PageResult getCommentPageByBlogIdAndPageNum(Long blogId, int page);
}
