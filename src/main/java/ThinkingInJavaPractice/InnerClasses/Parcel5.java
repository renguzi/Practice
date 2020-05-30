package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30 18:39
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                this.label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination("s");
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("Tasmania");
        System.out.println(destination.readLabel());
    }
}
