package ThinkingInJavaPractice.typeinfo;

/**
 * @Author:asher
 * @Date:2020/7/4 15:03
 * @Description:ThinkingInJavaPractice.typeinfo
 * @Version:1.0
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
