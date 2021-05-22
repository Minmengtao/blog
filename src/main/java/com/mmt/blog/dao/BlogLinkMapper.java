package com.mmt.blog.dao;

import com.mmt.blog.entity.BlogLink;
import com.mmt.blog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: minmengtao
 * @date: 2021/5/21
 */
@Mapper
public interface BlogLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(BlogLink record);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(BlogLink record);

    int updateByPrimaryKey(BlogLink record);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int getTotalLinks(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);
}
