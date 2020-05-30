package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Parcel2 {
    class Contents{
        private int i = 11;

        public int value() {
            return i;
        }
    }
    class Destination{
        private String label;

        Destination(String whereTo) {
            label=whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents contents = contents();
        Destination destination = to(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 parcel = new Parcel2();
        parcel.ship("Tasmania");
        Parcel2 parcel2 = new Parcel2();
        Parcel2.Contents contents = parcel2.contents();
        Parcel2.Destination destination = parcel2.to("Bornel");
        System.out.println(contents.value());
        System.out.println(destination.readLabel());
    }




}
