package com.example.mpdemo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/*
 *  @项目名：  mpdemo2 
 *  @包名：    com.example.mpdemo2.model
 *  @文件名:   UserModel
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/9 15:36
 *  @描述：    TODO
 */
@Data
@TableName("users")
public class UserModel {
    private int id;
    private String user_name;
    private String user_password;
    private int user_grade;
    private String user_gender;
    private int user_number_of_books;
    private String user_email;
    private Timestamp user_createTime;
}
