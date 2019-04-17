package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.model.UserModel;
import org.springframework.stereotype.Component;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.mapper
 *  @文件名:   UserMapper
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/9 11:56
 *  @描述：    TODO
 */
@Component
public interface UserMapper extends BaseMapper<UserModel> {
}
