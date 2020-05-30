package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30 22:37
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x){
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        Wrapping wrapping = parcel8.wrapping(10);
        System.out.println(wrapping.value());
    }
}
