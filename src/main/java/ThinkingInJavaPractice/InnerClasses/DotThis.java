package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30 15:55
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f");
    }
    public class Inner{
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner dti = dotThis.inner();
        dti.outer().f();
    }
}
