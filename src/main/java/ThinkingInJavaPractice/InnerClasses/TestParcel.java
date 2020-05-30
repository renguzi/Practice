package ThinkingInJavaPractice.InnerClasses;

import sun.security.krb5.internal.crypto.Des;

import java.beans.PropertyDescriptor;

/**
 * @Author:asher
 * @Date:2020/5/30 16:30
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
class Parcel4 {
    private class PContents implements Contents{
        private int anInt = 11;
        public int value() {
            return anInt;
        }
    }

    protected class PDestination implements Destination{
        private String label;

        PDestination(String whereTo) {
            this.label = whereTo;
        }
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination = parcel4.destination("Tasnima");
        Parcel4.PDestination pDestination = new Parcel4().new PDestination("tas");
//        pDestination = parcel4.destination("tas");
        Parcel4.PDestination pd = parcel4.new PDestination("java");

    }



}
