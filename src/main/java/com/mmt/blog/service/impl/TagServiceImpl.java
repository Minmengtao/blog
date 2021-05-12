package com.mmt.blog.service.impl;

import com.mmt.blog.dao.BlogTagMapper;
import com.mmt.blog.dao.BlogTagRelationMapper;
import com.mmt.blog.entity.BlogTagCount;
import com.mmt.blog.service.TagService;
import com.mmt.blog.util.PageQueryUtil;
import com.mmt.blog.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TagServiceImpl implements TagService {

    @Autowired
    private BlogTagMapper blogTagMapper;
    @Autowired
    private BlogTagRelationMapper relationMapper;

    @Override
    public PageResult getBlogTagPage(PageQueryUtil pageQueryUtil) {
        return null;
    }

    @Override
    public List<BlogTagCount> getBlogTagCountForIndex() {
        return null;
    }
}
