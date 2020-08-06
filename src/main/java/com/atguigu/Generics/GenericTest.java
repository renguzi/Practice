package com.atguigu.Generics;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/6 11:09
 * @Description:com.atguigu.Generics
 * @Version:1.0
 */
public class GenericTest {

    @Test
    public void test1() {
//        1 定义了泛型类之后，使用的时候，建议都带上泛型。虽然不带泛型也可以，但是不推荐。
        Order order = new Order();
        order.setOrderT("123");
        order.setOrderT(100);
//        2 带上泛型的类,此时，其数据类型就被限定了，不再是之前不带泛型时的Object类型，而是，我指定的类型。
        Order<String> order1 = new Order<>();
//        order1.setOrderT(100);  报错了，不能把整型放进去
        order1.setOrderT("100");

        Order<Integer> order2 = new Order<>();
//        order2.setOrderT("101"); //此时就不能放整型了，而是只能放String
        order2.setOrderT(101);
    }


    @Test
    public void test2() {
        SubOrder1 subOrder1 = new SubOrder1();
        subOrder1.setOrderT("101");
    }

    @Test
    public void test3() {
        SubOrder2<Integer> subOrder2 = new SubOrder2<>();
//        subOrder2.setOrderT(1);
        subOrder2.setOrderT("abc");
        System.out.println(subOrder2.getOrderT().getClass().toString());
    }

    @Test
    public void test4() {
        SubOrder3<Integer> subOrder3 = new SubOrder3<>();
       subOrder3.setOrderT(1);
       subOrder3.setOrderT(2);
    }

    @Test
//    测试泛型方法
    public void test5() {
        Order<String> order = new Order<>();
        Integer[] intArray = {1, 3, 999, 2};

       List<Integer> list =  order.copyFromArrayToList(intArray);
        System.out.println(list);
    }

}
