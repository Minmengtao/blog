package com.mmt.blog.controller.admin;

import com.mmt.blog.service.BlogService;
import com.mmt.blog.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author: minmengtao
 * @date: 2021/5/24
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @Resource
    private BlogService blogService;
    @Resource
    private CategoryService categoryService;

}
