package com.yupi.example.common.service;

import com.yupi.example.common.model.User;

public interface UserService {

    /**
     * 获取用户
     */
    User getUser(User user);

    /**
     * 新方法 过去数字
     */
    default short getNumber() {
        return 1;
    }
}
