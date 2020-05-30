package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30 16:03
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner di = dotNew.new Inner();
        DotNew.Inner di2 = new DotNew().new Inner();
    }
}
