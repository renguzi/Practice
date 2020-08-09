package com.atguigu.Generics.exer;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @Author:asher
 * @Date:2020/8/8 11:17
 * @Description:com.atguigu.Generics.exer
 * @Version:1.0
 */
public class DAOTest {
    @Test
    public void test() {
        DAO<User> userDAO = new DAO<>();
        userDAO.setMap(new HashMap<>());
//        System.out.println(userDAO.getMap().keySet().iterator().next());
        userDAO.save("1001", new User(1, 20, "张学友"));
        userDAO.save("1002", new User(2, 30, "黎明"));
        System.out.println(userDAO.get("1003"));
        System.out.println(userDAO.list());
//        下面的写法是Java8新特性，效果跟上面的一行代码相同
        userDAO.list().forEach(System.out::println);
        userDAO.update("1002", new User(3, 40, "刘德华"));
        userDAO.delete("1001");
        System.out.println(userDAO.list());
    }
}
