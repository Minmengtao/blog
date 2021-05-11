package com.mmt.blog.controller.vo;

import java.io.Serializable;

/**
 * 用VO来处理部分博客数据
 * @author minmengtao
 * @date 2021-5-11
 */
public class SimpleBlogListVO implements Serializable {
    //博客ID
    private Long blogId;
    //博客抬头
    private String blogTitle;

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }
}
