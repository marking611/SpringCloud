package com.example.demo.dt;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.Date;


/**
 * Created by Administrator on 2017/8/14 0014.
 */
public class Format {
    public static void main(String[] args){
        //格式化
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("默认格式："+localDateTimeNow);
        System.out.println("自定义格式："+dateTimeFormatter.format(localDateTimeNow));
        System.out.println("字符串转LocalDateTime:"+LocalDateTime.from(dateTimeFormatter.parse("2017-08-14 23:01:50")));
        System.out.println("字符串转LocalDateTime:"+LocalDateTime.parse("2017-08-14 23:03:20",dateTimeFormatter));

        //日期周期
        LocalDate localDate1 = LocalDate.parse("2017-08-14");
        LocalDate localDate2 = LocalDate.of(2017,7,28);
        long between1 = ChronoUnit.DAYS.between(localDate1,localDate2);
        System.out.println(between1);
        LocalDateTime localDateTime1 = LocalDateTime.parse("2017-08-14T23:19:20");
        LocalDateTime localDateTime2= LocalDateTime.of(2017,7,28,8,1,0);
        long between2 = ChronoUnit.HOURS.between(localDateTime1,localDateTime2);
        System.out.println(between2);


        //时间转换
        java.util.Date date1 = java.util.Date.from(Instant.now());
        Instant instant = date1.toInstant();
        System.out.println(instant);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date().toInstant(),ZoneId.systemDefault());
        Date date2 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date2);
        LocalDate localDate = LocalDateTime.ofInstant(new Date().toInstant(),ZoneId.systemDefault()).toLocalDate();
        Date date3 = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date3);
    }
}
