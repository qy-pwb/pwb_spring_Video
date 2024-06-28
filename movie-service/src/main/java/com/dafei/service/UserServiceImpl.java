package com.dafei.service;

import com.aliyun.vod.upload.common.MD5Util;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dafei.domain.User;
import com.dafei.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {

        // 将密码加密处理
        String passwordWidthMd5 = MD5Util.md5(password);

        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("username",username)
                .eq("password",passwordWidthMd5);
        User user = this.userMapper.selectOne(queryWrapper);
        return  user;
    }
}
