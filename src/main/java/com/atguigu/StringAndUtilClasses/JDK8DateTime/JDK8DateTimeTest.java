package com.atguigu.StringAndUtilClasses.JDK8DateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Author:asher
 * @Date:2020/9/17 15:13
 * @Description:com.atguigu.StringAndUtilClasses.JDK8DateTime
 * @Version:1.0
 */
public class JDK8DateTimeTest {
    @Test
    public void test() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        System.out.println(LocalDateTime.of(2020, 9, 17, 15, 22));

        System.out.println(localDateTime.getHour());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        TemporalAccessor accessor = dateTimeFormatter.parse("2020-09-17 16:08:01");
        System.out.println(accessor);


    }
}
