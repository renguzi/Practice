package ThinkingInJavaPractice.ReusingClasses;

/**
 * @Author:asher
 * @Date:2021/3/7 12:55
 * @Description:ThinkingInJavaPractice.ReusingClasses
 * @Version:1.0
 */
class Soap{
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "constructed";
    }

    public String toString() {
        return s;
    }
}
public class Bath {
    private String s1="Happy",s2="happy",s3,s4;
    private Soap castille=new Soap();
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "joy";
        toy=3.14f;
        castille = new Soap();
    }
    {i=47;
        System.out.println("i="+i);
    castille=new Soap();
        System.out.println("castille=" + castille);}

    public String toString() {
        if (s4 == null) {
            s4 = "Joy";
        }
        return "s1= " + s1 + "\n" +
                "s2= " + s2 + "\n" +
                "s3= " + s3 + "\n" +
                "s4= " + s4 + "\n" +
                "i=  " + i + "\n" +
                "toy= " + toy + "\n" +
                "castille= " + castille + "\n";
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
