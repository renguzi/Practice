package ThinkingInJavaPractice.typeinfo;

/**
 * @Author:asher
 * @Date:2020/7/4 15:21
 * @Description:ThinkingInJavaPractice.typeinfo
 * @Version:1.0
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = float.class;
        bounded = Number.class;
//        Or anything else derived from Number.
    }
}
