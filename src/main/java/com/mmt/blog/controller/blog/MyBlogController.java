package com.mmt.blog.controller.blog;

import com.mmt.blog.service.BlogService;
import com.mmt.blog.util.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author minmengtao
 * @date 2021-5-8
 *
 */
@Controller
public class MyBlogController {

    //页面主题
    //public static String theme = "default";
    //public static String theme = "yummy-jekyll";
    public static String theme = "amaze";

    @Resource
    private BlogService blogService;
    /**
     * 首页
     *
     * @param request
     * @return
     */
    @GetMapping({"/", "/index", "/index.html"})
    public String index(HttpServletRequest request) {
        return this.page(request, 1);
    }

    @GetMapping({"/page/{pageNum}"})
    public String page(HttpServletRequest request, @PathVariable("pageNum") int pageNum) {
        PageResult blogPageResult = blogService.getBlogsForIndexPage(pageNum);
        if(blogPageResult == null) {
            return "error/error_404";
        }
        request.setAttribute("blogPageResult", blogPageResult);
        request.setAttribute("newBlogs", blogService.getBlogListForIndexPage(1));
        request.setAttribute("hotBlogs", blogService.getBlogListForIndexPage(0));
        request.setAttribute("pageName", "首页");
        return "blog/" + theme + "/index";
    }
}
