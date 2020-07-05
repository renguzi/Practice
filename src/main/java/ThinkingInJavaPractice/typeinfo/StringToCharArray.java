package ThinkingInJavaPractice.typeinfo;

/**
 * @Author:asher
 * @Date:2020/7/4 22:29
 * @Description:ThinkingInJavaPractice.typeinfo
 * @Version:1.0
 */
public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Asher Huang";
        char[] chars = new char[s.length()];
        chars = s.toCharArray();
        System.out.println(chars);
        char[] chars1 = new char[s.length()*2];
        System.out.print("Before");
        System.out.println(chars1);
        s.getChars(0, s.length(), chars1, 5);
        System.out.print("After");
        System.out.println(chars1);
        System.out.println(chars1.length);
        s.getChars(0,4,chars1,11);
        System.out.println(chars1);

        String s2 = new String(chars1);
        System.out.println(s2);
    }
}
