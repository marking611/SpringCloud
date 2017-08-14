package com.example.demo.dt;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by Administrator on 2017/8/14 0014.
 */
public class DateTime {
    public static void main(String[] args){
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("现在时间："+localDateTimeNow);
        System.out.println("明天现在时间："+localDateTimeNow.plusDays(1));
        System.out.println("两小时前时间："+localDateTimeNow.minusHours(2));
        System.out.println("当前月份："+localDateTimeNow.getMonth());
        LocalDateTime localDateTime1 = LocalDateTime.of(2017, Month.AUGUST,14,22,47,40);
        LocalDateTime localDateTime2 = LocalDateTime.parse("2017-08-14T22:47:19");
        System.out.println(localDateTime1+"   "+localDateTime2);


    }
}
