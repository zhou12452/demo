package com.example.mpdemo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.model
 *  @文件名:   RecordModel
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/9 17:35
 *  @描述：    TODO
 */
@Data
@TableName("record")
public class RecordModel {

    private int id;
    private int user_id;
    private int book_id;
    private int book_type;
    private Timestamp borrow_time;
    private Timestamp expiration_time;
    private Timestamp returnbook_time;
    private String borrow_status;


}
