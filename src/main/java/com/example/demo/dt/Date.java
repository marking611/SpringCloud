package com.example.demo.dt;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Administrator on 2017/8/14 0014.
 */
public class Date {
    public static void main(String[] args){
        LocalDate localDateNow = LocalDate.now();
        System.out.println("今天是："+localDateNow);
        System.out.println("今天是周："+localDateNow.getDayOfWeek());
        System.out.println("明天是："+localDateNow.plusDays(1));
        System.out.println("一个月前是："+localDateNow.minus(1, ChronoUnit.MONTHS));
        System.out.println("今年是闰年？："+localDateNow.isLeapYear());
        System.out.println("本月第一天是："+localDateNow.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate localDate1 = LocalDate.of(2017,6,13);
        LocalDate localDate2 = LocalDate.parse("2017-05-19");
        System.out.println(localDate1+"    "+localDate2);
        System.out.println("date1是不是在date2之前"+localDate1.isBefore(localDate2));
        System.out.println("今天是不是06-13？"+ MonthDay.of(localDate1.getMonth(),localDate1.getDayOfMonth()).equals(MonthDay.from(localDateNow)));
    }
}
