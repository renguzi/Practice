package ThinkingInJavaPractice.Polymorphism.music3;

import ThinkingInJavaPractice.Polymorphism.music.Note;

/**
 * @Author:asher
 * @Date:2021/3/14 12:37
 * @Description:ThinkingInJavaPractice.Polymorphism.music3
 * @Version:1.0
 */
class Instrument{
    void play(Note note) {
        System.out.println("Instrument.play()" + note);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note note) {
        System.out.println("Wind.play()" + note);
    }

    String what() {
        return "wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note note) {
        System.out.println("Stringed.play" + note);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting stringed");
    }
}

class Woodwind extends Wind {
    void play(Note note) {
        System.out.println("Woodwind.play()" + note);
    }

    String what() {
        return "Woodwind";
    }
}

class Brass extends Wind {
    void play(Note note) {
        System.out.println("Brass.play()" + note);
    }

    String what() {
        return "Brass";
    }
}
public class Music3 {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument i:instruments ) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Woodwind(), new Brass(), new Stringed()};
        tuneAll(orchestra);
    }
}
