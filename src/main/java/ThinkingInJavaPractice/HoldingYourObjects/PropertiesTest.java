package ThinkingInJavaPractice.HoldingYourObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author:asher
 * @Date:2021/2/7 18:24
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        Properties properties = new Properties();
        try {
            fileInputStream = new FileInputStream("jdbc.properties");
            properties.load(fileInputStream);
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println("username: " + username + " password:" + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
