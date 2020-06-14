package JavaCore.chap05.enums;

/**
 * @Author:asher
 * @Date:2020/6/14 16:41
 * @Description:JavaCore.chap05.enums
 * @Version:1.0
 */
public class VarArgsTest {
    public static void main(String... args) {
        double[] darray = new double[]{3.14, -1.24, 56.2, 901.3};
        System.out.println("The max element of the array is" + maxDouble(darray));

        double max = maxDouble(1.3, 2.4, -1.5, 100.2, 13.15);
        System.out.println(max);

    }

    public static double maxDouble(double... doubles) {
        double d = Double.NEGATIVE_INFINITY;
        for (double d1:doubles) {
            if (d1 > d) {
                d=d1;
            }
        }
        return d;
    }
}
