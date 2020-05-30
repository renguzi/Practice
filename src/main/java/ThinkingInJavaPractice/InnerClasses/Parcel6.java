package ThinkingInJavaPractice.InnerClasses;

/**
 * @Author:asher
 * @Date:2020/5/30 19:01
 * @Description:ThinkingInJavaPractice.InnerClasses
 * @Version:1.0
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip{
                private String id;

                TrackingSlip(String s) {
                    this.id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip trackingSlip = new TrackingSlip("slip");
            System.out.println(trackingSlip.getSlip());
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }

}
