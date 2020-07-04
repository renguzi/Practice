package ThinkingInJavaPractice.typeinfo;

/**
 * @Author:asher
 * @Date:2020/7/4 14:50
 * @Description:ThinkingInJavaPractice.typeinfo
 * @Version:1.0
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericClass = int.class;
        genericClass = Integer.class;
//        intClass = double.class;
//        genericClass = double.class;
        System.out.println(intClass == genericClass);
        System.out.println(genericClass.getName());
        System.out.println(intClass.getName());
    }
}
