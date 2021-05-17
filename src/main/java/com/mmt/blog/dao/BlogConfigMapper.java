package com.mmt.blog.dao;

import com.mmt.blog.entity.BlogConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author minmengtao
 * @date 2021-5-17
 */
@Mapper
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig revord);
}
