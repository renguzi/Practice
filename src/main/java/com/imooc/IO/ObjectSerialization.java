package com.imooc.IO;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/2 22:57
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class ObjectSerialization {
    public static void main(String[] args) {
        Dog dog = new Dog("嘿嘿", 3);
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try{
            fileOutputStream = new FileOutputStream("/Users/asher/imooc/object_serialization.txt");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dog);
            fileInputStream=new FileInputStream("/Users/asher/imooc/object_serialization.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
//            Dog dog1 = (Dog) objectInputStream.readObject();
            System.out.println(objectInputStream.readObject());
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
