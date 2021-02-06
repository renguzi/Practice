package ThinkingInJavaPractice.initialization;

/**
 * @Author:asher
 * @Date:2021/2/6 19:57
 * @Description:ThinkingInJavaPractice.initialization
 * @Version:1.0
 */
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main.");
        new Mugs();
        System.out.println("new Mugs() completed.");
        new Mugs(1);
        System.out.println("new Mugs(1) completed.");
    }
}
