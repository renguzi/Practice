package JavaCore.chap06.innerclasses;

import javax.swing.*;

/**
 * @Author:asher
 * @Date:2020/6/25 16:29
 * @Description:JavaCore.chap06.innerclasses
 * @Version:1.0
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, true);
        talkingClock.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
