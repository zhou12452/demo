package com.example.mpdemo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.task
 *  @文件名:   ScheduledService
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/16 14:46
 *  @描述：    TODO
 */
@Slf4j
@Component
public class ScheduledService {
    @Scheduled(cron = "0 51 14 * * *")
    public void scheduled() {
        log.info("=====>>>>>定时使用cron  {}", System.currentTimeMillis());
    }

}
