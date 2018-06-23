package com.example.boot.service.Impl;

import com.example.boot.core.ret.ServiceException;
import com.example.boot.dao.UserInfoMapper;
import com.example.boot.model.UserInfo;
import com.example.boot.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public PageInfo<UserInfo> selectAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;
    }
}
