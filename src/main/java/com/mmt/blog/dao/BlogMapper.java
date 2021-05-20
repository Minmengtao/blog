package com.mmt.blog.dao;

import com.mmt.blog.entity.Blog;
import com.mmt.blog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Blog持久层,与/resources/mapper/*.xml一一对应
 * @author minmengtao
 * @date 2021-5-11
 */
@Mapper
public interface BlogMapper {
    Blog selectByPrimaryKey(Long blogId);

    int updateByPrimaryKey(Blog record);

    //查询所有博客
    List<Blog> findBlogList(PageQueryUtil pageUtil);

    //返回博客数量
    int getTotalBlogs(PageQueryUtil pageQueryUtil);

    //返回按类型查询
    List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);
}
