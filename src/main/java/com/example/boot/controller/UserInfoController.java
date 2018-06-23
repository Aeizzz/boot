package com.example.boot.controller;

import com.example.boot.core.ret.RetResponse;
import com.example.boot.core.ret.RetResult;
import com.example.boot.model.UserInfo;
import com.example.boot.service.UserInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "userinfo")
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @PostMapping(value = "/hello")
    public String Hello() {
        return "Hello World";
    }

    @ApiOperation(value = "查询用户", notes = "根据用户id查询用户")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "用户id", required = true,
            dataType = "Integer", paramType = "query")})
    @PostMapping(value = "/selectById")
    public RetResult<UserInfo> selectById(@RequestParam Integer id) {
        UserInfo userInfo = userInfoService.selectById(id);
        return RetResponse.makeOKRsp(userInfo);
    }

    @PostMapping("/testException")
    public RetResult<UserInfo> testException(Integer id) {
        List a = null;
        a.size();
        UserInfo userInfo = userInfoService.selectById(id);
        return RetResponse.makeOKRsp(userInfo);
    }


}
