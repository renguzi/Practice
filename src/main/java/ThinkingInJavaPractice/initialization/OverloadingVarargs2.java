package ThinkingInJavaPractice.initialization;

/**
 * @Author:asher
 * @Date:2021/2/6 22:03
 * @Description:ThinkingInJavaPractice.initialization
 * @Version:1.0
 */
public class OverloadingVarargs2 {
    static void f(float f, Character... args) {
        System.out.println("first");
    }

    static void f(char a,Character... args) {
        System.out.println("secod");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}
