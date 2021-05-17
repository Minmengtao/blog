package com.mmt.blog.dao;

import com.mmt.blog.entity.BlogTagCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author minmengtao
 * @date 2021-5-17
 */
@Mapper
public interface BlogTagMapper {
    List<BlogTagCount> getTagCount();
}
