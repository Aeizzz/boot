package com.example.boot.service.Impl;

import com.example.boot.core.ret.ServiceException;
import com.example.boot.dao.UserInfoMapper;
import com.example.boot.model.UserInfo;
import com.example.boot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(Integer id) {
        UserInfo userInfo = userInfoMapper.selectById(id);
        if (userInfo == null) {
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }
}
