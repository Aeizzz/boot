package com.example.boot.dao;

import com.example.boot.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    UserInfo selectById(@Param("id") Integer id);


}
