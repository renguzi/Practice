package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/31 12:14
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor,i =" + i);
    }

    public abstract void f();
}
public class AnonymousClass {
    public static Base getBase(int i) {
        return new Base(i) {
            { System.out.println("Inside instance initializer");}
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        Base base = getBase(47);
        base.f();
    }

}
