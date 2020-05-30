package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Outer {
    class Inner{
        private void sayHello(String s) {
            System.out.println("Hello " + s + " from Inner class");
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        inner.sayHello("Java");
    }

}
