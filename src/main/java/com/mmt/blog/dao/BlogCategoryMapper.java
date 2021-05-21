package com.mmt.blog.dao;

import com.mmt.blog.entity.BlogCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 博客分类Category
 * @author minmengtao
 * @date 2020-5-11
 */
@Mapper
public interface BlogCategoryMapper {
    BlogCategory selectByPrimaryKey(Integer categoryId);

    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);
}
