package JavaCore.chap05.enums;

import java.util.Scanner;

/**
 * @Author:asher
 * @Date:2020/6/14 16:21
 * @Description:JavaCore.chap05.enums
 * @Version:1.0
 */
public class EnumTest {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: SMALL,MEDIUM,LARGE,EXTRALAGRE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("abbreviation=" + size.getAbbrevation());
        if (size == Size.EXTRALARGE) {
            System.out.println("Good job,you paid attention to the _.");
        }
        System.out.println(size.ordinal());
    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRALARGE("XL");

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbrevation() {
        return abbreviation;
    }

    private String abbreviation;
}
