package com.imooc.reflection;

import java.lang.reflect.Constructor;

/**
 * @Author:asher
 * @Date:2020/6/24 15:59
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
    public class OfficeBetter{
        public static void main(String[] args){
            try{
//                Class c=Class.forName(args[0]);
                Class c=args[0].getClass();

                System.out.println(c.getName());
                Constructor constructor=c.getConstructor();
                OfficeAble oa=(OfficeAble)constructor.newInstance();
//	 OfficeAble oa =(OfficeAble) Class.forName(args[0]).getConstructor().newInstance();
//	Class c=args[0].class;
//	 OfficeAble oa =(OfficeAble) c.newInstance();
                oa.start();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

