package ThinkingInJavaPractice.Polymorphism.music;

/**
 * @Author:asher
 * @Date:2021/3/14 08:30
 * @Description:ThinkingInJavaPractice.Polymorphism.music
 * @Version:1.0
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
