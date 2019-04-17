package com.example.mpdemo.controller;

import com.example.mpdemo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.controller
 *  @文件名:   UserController
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/9 13:56
 *  @描述：    TODO
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "测试方法" , notes = "输出用户信息")
    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return userService.getUser().toString();
    }
}
