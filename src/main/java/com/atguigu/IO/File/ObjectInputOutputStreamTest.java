package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/9 21:18
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class ObjectInputOutputStreamTest {
    /**
     * 对象序列化和反序列化；
     * ObjectInputStream和ObjectOutputStream
     */
    @Test
    public void test() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/asher/imooc/obj.data"));
            objectOutputStream.write(101);
            objectOutputStream.writeObject(new String("hello世界"));
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("/Users/asher/imooc/obj.data"));
            System.out.println(objectInputStream.read());
            System.out.println(objectInputStream.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void serialezePerson() throws IOException, ClassNotFoundException {
        OutputStream out;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"));
        Person person = new Person(101, "Jack");
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"));
//        System.out.println(objectInputStream.readObject().getClass().getName());
        System.out.println(objectInputStream.readObject().toString());
    }

    @Test
    public void unserialezePerson() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"));
//        System.out.println(objectInputStream.readObject().getClass().getName());
        System.out.println(objectInputStream.readObject().toString());
    }
}
