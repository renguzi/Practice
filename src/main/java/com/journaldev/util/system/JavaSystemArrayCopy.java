package com.journaldev.util.system;

import java.io.*;
import java.util.*;

/**
 * @Author:asher
 * @Date:2020/7/5 17:50
 * @Description:com.journaldev.util.system
 * @Version:1.0
 */
public class JavaSystemArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};
        System.arraycopy(array1, 0, array2, 2, 2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Properties sysProperties = System.getProperties();
        System.out.println(sysProperties);
//        System.out.println(sysProperties.keySet());
        Set<Object> keySet = sysProperties.keySet();
        for (Object obj : keySet) {
            String key = (String) obj;
            System.out.println("{"+obj+"="+sysProperties.getProperty(key)+"}");
        }
        System.out.println(System.getProperty("user.country"));
        System.setProperty("user.country", "CHINA");
        System.out.println(System.getProperty("user.country"));
        Map<String, String> envMap = System.getenv();
        Set<String> envKeySet = envMap.keySet();
        for (String key : envKeySet) {
            System.out.println("Key= " + key + " Value=" + envMap.get(key));
        }
        String pathValue = System.getenv("PATH");
        System.out.println("pathValue:" + pathValue);

//        SecurityManager
        SecurityManager securityManager=System.getSecurityManager();
        if (securityManager == null) {
            System.out.println("Security Manager is not configured");
        }
        SecurityManager mySecurityManager = new SecurityManager();
        System.setSecurityManager(mySecurityManager);
        if (securityManager != null) {
            System.out.println("Security Manager is configured");
        }
        File file;
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos=new FileOutputStream("server.log");) {
            System.setIn(fis);
            char c = (char) System.in.read();
            System.out.println(c);

            System.setOut(new PrintStream(fos));
            System.out.println("Hi Ashe\n".getBytes());

            System.setErr(new PrintStream(fos));
            System.out.println("Exception error\n".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
