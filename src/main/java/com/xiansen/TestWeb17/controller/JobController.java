package com.xiansen.TestWeb17.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class JobController
{
    //cron = "0/10 * * * * ?" 每10秒触发一次
    @Scheduled(cron = "0/10 * * * * ?")
    public void printTime() {
        System.out.println("current time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
