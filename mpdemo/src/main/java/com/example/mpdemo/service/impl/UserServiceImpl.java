package com.example.mpdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo.mapper.CommonMapper;
import com.example.mpdemo.mapper.RecordMapper;
import com.example.mpdemo.mapper.UserMapper;
import com.example.mpdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/9 13:54
 *  @描述：    TODO
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private CommonMapper commonMapper;

    @Override
    public List<Map<String , Object>> getUser() {

        QueryWrapper queryWrapper = new QueryWrapper();
        List<Map<String, Object>> list = commonMapper.getUser(queryWrapper);
        return list;
//        return null;
    }
}
