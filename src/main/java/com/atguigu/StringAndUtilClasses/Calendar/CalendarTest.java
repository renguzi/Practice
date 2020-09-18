package com.atguigu.StringAndUtilClasses.Calendar;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

/**
 * @Author:asher
 * @Date:2020/9/17 14:47
 * @Description:com.atguigu.StringAndUtilClasses.Calendar
 * @Version:1.0
 */
public class CalendarTest {
    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getClass());

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.DAY_OF_MONTH, 33);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //Calendar-->Date
        System.out.println(calendar.getTime());
    }
}
