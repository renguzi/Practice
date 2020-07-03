package com.imooc.reflection;

/**
 * @Author:asher
 * @Date:2020/6/26 22:54
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
class Test{
    public static void main(String[] args){
        ZZ z1=new ZZ();
        z1.start();
        try{
            ZZ zz=(ZZ) Class.forName(args[0]).getDeclaredConstructor().newInstance();
            zz.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

