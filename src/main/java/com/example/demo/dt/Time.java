package com.example.demo.dt;

import java.time.LocalTime;

/**
 * Created by Administrator on 2017/8/14 0014.
 */
public class Time {
    public static void main(String[] args){
        LocalTime localTimeNow = LocalTime.now();
        System.out.println("现在时刻："+localTimeNow);
        System.out.println("现在时刻(时)："+localTimeNow.getHour());
        System.out.println("现在时刻(分)："+localTimeNow.getMinute());
        System.out.println("现在时刻(秒)："+localTimeNow.getSecond());
        System.out.println("一个小时之后："+localTimeNow.plusHours(1));
        LocalTime localTime1 = LocalTime.parse("15:55");
        LocalTime localTime2 = LocalTime.of(12,34,12);
        System.out.println(localTime1+"   "+localTime2);
        System.out.println("今天开始时间："+LocalTime.MIN +" 今天结束时间"+LocalTime.MAX);
    }
}
