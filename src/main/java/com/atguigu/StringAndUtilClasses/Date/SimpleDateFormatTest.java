package com.atguigu.StringAndUtilClasses.Date;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:asher
 * @Date:2020/9/16 17:39
 * @Description:com.atguigu.StringAndUtilClasses.Date
 * @Version:1.0
 */
public class SimpleDateFormatTest {
    @Test
    public void test() throws ParseException {
        //默认构造方法
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化 将Date转换为指定格式的日期显示
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));
//        System.out.println(sdf.parse(String.valueOf(date)));

        //解析：将特定格式的字符串，转换为日期
        String dateString = "2020-09-16 17:20:33";
//        System.out.println(sdf.parse(dateString));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("-----------");
        System.out.println(simpleDateFormat.parse(dateString));
        System.out.println("8888888888888888888");
        System.out.println(simpleDateFormat.format(date));

        String s1 = "2020-09-17";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat1.parse(s1);
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);

    }
}
