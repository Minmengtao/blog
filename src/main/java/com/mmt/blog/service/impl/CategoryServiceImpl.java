package com.mmt.blog.service.impl;

import com.mmt.blog.dao.BlogCategoryMapper;
import com.mmt.blog.entity.BlogCategory;
import com.mmt.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: minmengtao
 * @date: 2021/5/21
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    @Override
    public int getTotalCategories() {
        return blogCategoryMapper.getTotalCategories(null);
    }

    @Override
    public List<BlogCategory> getAllCategories() {
        return blogCategoryMapper.findCategoryList(null);
    }
}
