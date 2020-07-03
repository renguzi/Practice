package JavaCore.chap06.innerclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @Author:asher
 * @Date:2020/6/25 16:23
 * @Description:JavaCore.chap06.innerclasses
 * @Version:1.0
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
//        TimePrinter listener = new TimePrinter();
        ActionListener listener = this.new TimePrinter();
        Timer timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is" + Instant.ofEpochMilli(e.getWhen()));
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
