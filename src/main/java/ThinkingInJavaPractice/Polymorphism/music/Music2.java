package ThinkingInJavaPractice.Polymorphism.music;

import javafx.stage.Window;

/**
 * @Author:asher
 * @Date:2021/3/14 11:38
 * @Description:ThinkingInJavaPractice.Polymorphism.music
 * @Version:1.0
 */
class Stringed extends Instrument{
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }
}

class Brass extends Instrument{
    public void play(Note note) {
        System.out.println("Brass.play()" + note);
    }
}
public class Music2 {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }
//    public static void tune(Wind wind) {
//        wind.play(Note.MIDDLE_C);
//    }
//
//    public static void tune(Stringed stringed) {
//        stringed.play(Note.MIDDLE_C);
//    }
//
//    public static void tune(Brass brass) {
//        brass.play(Note.MIDDLE_C);
//    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
