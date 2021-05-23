package com.mmt.blog.service.impl;

import com.mmt.blog.dao.AdminUserMapper;
import com.mmt.blog.entity.AdminUser;
import com.mmt.blog.service.AdminUserService;
import com.mmt.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: minmengtao
 * @date: 2021/5/23
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;
    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, passwordMd5);
    }
}
