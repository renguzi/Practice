package ThinkingInJavaPractice.ReusingClasses;

/**
 * @Author:asher
 * @Date:2021/3/6 18:55
 * @Description:ThinkingInJavaPractice.ReusingClasses
 * @Version:1.0
 */
class WaterHouse{
    private String s;

    WaterHouse() {
        System.out.println("WaterHouse()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String value1,value2,value3,value4;
    private WaterHouse source = new WaterHouse();
    private int i;
    private float f;

    public String toString() {
        return
                "value1 = "+value1+"  "+
                "value2 = "+value2+"  "+
                "value3 = "+value3+"  "+
                "value4 = "+value4+"\n"+
                "i= "+i+"  "+"f= "+f+"  "+
                "source = "+source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
