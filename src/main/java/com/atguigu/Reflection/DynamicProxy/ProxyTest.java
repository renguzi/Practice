package com.atguigu.Reflection.DynamicProxy;

/**
 * @Author:asher
 * @Date:2020/8/17 11:04
 * @Description:com.atguigu.Reflection.DynamicProxy
 * @Version:1.0
 */

import com.atguigu.Reflection.StaticFactory.ClothFactory;
import com.atguigu.Reflection.StaticFactory.NikeClothFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;

/**
 * 1 如何根据加载到内存中的被代理类，去动态创建一个代理类及其对象？
 * 2 如何通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法？
 */

//生产代理类的工厂
class ProxyFactory {
    //调用此方法，返回一个代理类的对象,解决问题一
    //要想解决问题一，就得告诉我此时，我创建的代理类，它究竟是代理的哪一个类的，所以，我们把被代理类当一个形参传递进去
    //形参object就是我们将来创建的被代理类的对象，然后根据这个被代理类的对象，动态的去创建一个代理类的对象
    //方法返回值Object就是我们创建的代理类的类型。
    public static Object getProxyInstance(Object object) {
        MyInvocaktionHandler handler = new MyInvocaktionHandler(object);
        Object obj = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), handler);
        return obj;
    }
}


class MyInvocaktionHandler implements InvocationHandler {
    private Object obj;//代理类的对象，用被代理类的对象去给它赋值

    public MyInvocaktionHandler(Object obj) {
        this.obj = obj;
    }

    //当我们通过代理类的对象调用方法a时，就会自动的通过被代理类调用下面的invoke()方法.
//所以，我们把代理类执行的方法a的的功能声明在invoke()方法中，这样就实现了我们的目的：
//    即，通过代理类调用方法a时，其实是被代理类在执行方法a的功能。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retrunValue = method.invoke(obj, args);
        System.out.println(proxy.getClass().getName());
        System.out.println(proxy.getClass().getName().toString());
        return retrunValue;
    }
}
public class ProxyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        SuperMan superMan = new SuperMan();
//        String s = superMan.getBelief();
//        System.out.println(s);
//        superMan.eat("火锅");
        //根据被代理类的对象，创建1个代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        System.out.println(Proxy.isProxyClass(proxyInstance.getClass()));
        System.out.println(Proxy.isProxyClass(superMan.getClass()));
        System.out.println("代理类的名字为：" + proxyInstance.toString());
        String s = proxyInstance.getBelief();
        System.out.println(s);
        proxyInstance.eat("火锅");
//        NikeClothFactory nikeClothFactory = new NikeClothFactory();
//        ClothFactory clothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
//        clothFactory.productCloth();
    }
}
