package com.dafei.service;

import com.dafei.domain.User;

public interface UserService {

    public User login(String username, String password);
}