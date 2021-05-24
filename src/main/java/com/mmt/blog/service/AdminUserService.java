package com.mmt.blog.service;

import com.mmt.blog.entity.AdminUser;

/**
 * @author: minmengtao
 * @date: 2021/5/23
 */
public interface AdminUserService {

    AdminUser login(String userName, String password);

    /**
     * 获取用户信息
     * @param loginUserId
     * @return
     */
    AdminUser getUserDetailById(Integer loginUserId);

    /**
     * 更新管理员密码
     * @param loginUserId
     * @param originalPassword
     * @param newPassword
     * @return
     */
    Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword);

    /**
     * 修改当前登陆用户的名称信息
     * @param loginUserId
     * @param loginUserName
     * @param nickName
     * @return
     */
    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);
}
