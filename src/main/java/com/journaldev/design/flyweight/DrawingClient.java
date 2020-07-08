package com.journaldev.design.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author:asher
 * @Date:2020/7/8 09:59
 * @Description:com.journaldev.design.flyweight
 * @Version:1.0
 */
public class DrawingClient extends JFrame {
    private static final long serialVersionUID=-1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;
    private static final ShapeFactory.ShapeType shapes[] = {ShapeFactory.ShapeType.LINE, ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL};
    private static final Color colors[] = {Color.BLUE, Color.red, Color.ORANGE};

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container containerPane = getContentPane();
        JButton startButton = new JButton("Draw");
        final JPanel jPanel = new JPanel();
        containerPane.add(jPanel, BorderLayout.CENTER);
        containerPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = jPanel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g,getRandomX(),getRandomY(),getRandomWidth(),getRandomHeight(),getRandomColor());
                }
            }
        });
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return (colors)[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        DrawingClient drawingClient = new DrawingClient(500, 600);
    }
}
