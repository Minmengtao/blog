package com.mmt.blog.service;

import com.mmt.blog.entity.BlogCategory;
import com.mmt.blog.util.PageQueryUtil;
import com.mmt.blog.util.PageResult;

import java.util.List;

public interface CategoryService {
    /**
     * 查询分类的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    int getTotalCategories();

    /**
     * 添加分类数据
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean saveCategory(String categoryName, String categoryIcon);

    /**
     * 更新分类数据
     * @param categoryId
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    /**
     * 删除分类
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();
}
