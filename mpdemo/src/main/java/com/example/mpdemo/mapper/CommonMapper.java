package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.mapper
 *  @文件名:   CommonMapper
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/9 17:39
 *  @描述：    TODO
 */
@Component
public interface CommonMapper {

    List<Map<String , Object>> getUser(@Param(Constants.WRAPPER) Wrapper wrapper);
}
