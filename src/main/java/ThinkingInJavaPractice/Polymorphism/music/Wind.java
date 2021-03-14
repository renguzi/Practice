package ThinkingInJavaPractice.Polymorphism.music;

/**
 * @Author:asher
 * @Date:2021/3/14 08:29
 * @Description:ThinkingInJavaPractice.Polymorphism.music
 * @Version:1.0
 */
public class Wind extends Instrument{
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
}
