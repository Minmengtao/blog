package com.mmt.blog.dao;

import com.mmt.blog.entity.BlogComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author: minmengtao
 * @date: 2021/5/21
 * @description:
 */
@Mapper
public interface BlogCommentMapper {
    List<BlogComment> findBlogCommentList(Map map);

    int getTotalBlogComments(Map map);
}
