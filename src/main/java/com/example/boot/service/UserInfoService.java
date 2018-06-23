package com.example.boot.service;

import com.example.boot.model.UserInfo;
import com.github.pagehelper.PageInfo;


public interface UserInfoService {


    UserInfo selectById(Integer id);

    PageInfo<UserInfo> selectAll(Integer page, Integer size);

}
