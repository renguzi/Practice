package cn.oracleonlinux.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author:asher
 * @Date:2020/6/2 15:01
 * @Description:cn.oracleonlinux.maven
 * @Version:1.0
 */
public class TestHello {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String result = hello.sayHello("java newbie");
        assertEquals("Hello java newbie", result);
    }
}
