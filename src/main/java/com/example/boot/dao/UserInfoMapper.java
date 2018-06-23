package com.example.boot.dao;

import com.example.boot.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    UserInfo selectById(@Param("id") Integer id);

    List<UserInfo> selectAll();

}
