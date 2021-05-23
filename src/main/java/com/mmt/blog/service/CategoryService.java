package com.mmt.blog.service;

import com.mmt.blog.entity.BlogCategory;

import java.util.List;

public interface CategoryService {
    int getTotalCategories();

    List<BlogCategory> getAllCategories();
}
