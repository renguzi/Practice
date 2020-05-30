package ThinkingInJavaPractice.InnerClasses;

import javax.print.attribute.standard.Destination;

/**
 * @Author:asher
 * @Date:2020/5/30 16:08
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo) {
            this.label=whereTo;
        }

        String readLabel() {
            return this.label;
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        Parcel3.Contents contents = parcel3.new Contents();
        Parcel3.Destination destination = parcel3.new Destination("Tasamania");
        System.out.println(contents.value());
        System.out.println(destination.readLabel());
    }
}
