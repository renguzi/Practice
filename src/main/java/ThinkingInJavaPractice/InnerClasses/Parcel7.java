package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30 19:11
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i=11;
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
        System.out.println(contents.value());
    }
}
