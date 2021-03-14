package ThinkingInJavaPractice.ReusingClasses;
/**
 * @Author:asher
 * @Date:2021/3/12 21:57
 * @Description:ThinkingInJavaPractice.ReusingClasses
 * @Version:1.0
 */
class WithFinals{
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate f()");
    }

    private final void g() {
        System.out.println("OverridingPrivate g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    public final void f() {
        System.out.println("OverridingPrivate2 f()");
    }
    public final void g(){
        System.out.println("OverridingPrivate2 g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //you can upcast,
        OverridingPrivate op = op2;
        //but you cant call the methods:
//        op.f();
//        op.g();
        //同样的道理，虽然op2可以upcast成WithFinals父类，但是并不能调用父类中的方法，f()和g()
        WithFinals wf = op2;
//        wf.f();
//        wf.g();
    }
}
