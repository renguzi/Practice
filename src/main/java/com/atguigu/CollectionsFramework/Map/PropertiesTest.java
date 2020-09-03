package com.atguigu.CollectionsFramework.Map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * @Author:asher
 * @Date:2020/9/1 17:32
 * @Description:com.atguigu.CollectionsFramework.Map
 * @Version:1.0
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //默认情况下，读取的是当前工程下的文件
        properties.load(new FileInputStream("jdbc.properties"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.get("password"));
        HashMap map = new HashMap();
        map.put(1, "one");
        map.put(1, "yi");
        map.put(2, "two");
        System.out.println(map);
    }
}
