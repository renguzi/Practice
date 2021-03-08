package ThinkingInJavaPractice.AccessControl;

/**
 * @Author:asher
 * @Date:2021/3/6 16:16
 * @Description:ThinkingInJavaPractice.AccessControl
 * @Version:1.0
 */
class Soup1 {
    private Soup1() {
    }
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }
    private static Soup2 ps=new Soup2();
    public static Soup2 access() {
        return ps;
    }

    public void f() {
    }
}


public class Lunch {
    void testPrivate() {
//        Soup1 soup1 = new Soup1();
    }

    void testStatic() {
        Soup1 soup1=Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
