package com.atguigu.ToolsClass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author:asher
 * @Date:2020/8/28 17:26
 * @Description:com.atguigu.ToolsClass
 * @Version:1.0
 */
public class CompareTest {
    @Test
    public void test() {
        String[] arr = new String[]{"AA", "ZZ", "KK", "ff"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test1() {
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("Mouse", 12);
        goods[1] = new Goods("keyboard", 199);
        goods[2] = new Goods("card", 4);
        goods[3] = new Goods("monitor", 199);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }

    @Test
    public void test2() {
        String[] arr = new String[]{"AA", "ZZ", "KK", "ff"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return o1.compareTo(o2);
                }
                throw new RuntimeException();
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
