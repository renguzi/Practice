package com.atguigu.StringAndUtilClasses.Annotation;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

/**
 * @Author:asher
 * @Date:2020/9/18 11:05
 * @Description:com.atguigu.StringAndUtilClasses.Annotation
 * @Version:1.0
 */
public class AnnotationTest {

    @Before
    public void before() {
        System.out.println("@Before");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass...");
    }

    @MyAnnotation(value1= "he")
    @Test
    public void test() {
        System.out.println("@Test...");
    }

    @After
    public void after() {
        System.out.println("@After");
    }

    @Test
    public void testAnnotation() {
        Class<Student> studentClass = Student.class;
        Annotation[] annotations = studentClass.getAnnotations();
        for (Annotation a: annotations ) {
            System.out.println(a);
        }
    }
}
