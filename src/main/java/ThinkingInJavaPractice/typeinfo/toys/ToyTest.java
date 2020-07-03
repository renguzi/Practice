package ThinkingInJavaPractice.typeinfo.toys;

/**
 * @Author:asher
 * @Date:2020/7/3 22:42
 * @Description:ThinkingInJavaPractice.typeinfo.toys
 * @Version:1.0
 */
interface HasBatteries {
}
interface WaterProof {
}
interface Shoots {
}
class Toy{
    Toy() {
    }
    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots {
    FancyToy() {
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class c) {
        System.out.println("Class name:" + c.getName() + " is interface ? [" + c.isInterface() + " ]");
        System.out.println("Simple name:" + c.getSimpleName());
        System.out.println("Canonical name:" + c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ThinkingInJavaPractice.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("can't find FancyToy.");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(object.getClass());
    }

}
