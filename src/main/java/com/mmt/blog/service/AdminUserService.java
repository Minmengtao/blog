package com.mmt.blog.service;

import com.mmt.blog.entity.AdminUser;

/**
 * @author: minmengtao
 * @date: 2021/5/23
 */
public interface AdminUserService {

    AdminUser login(String userName, String password);
}
