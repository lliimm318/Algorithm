package com.company.Algorithm.cording.test.linux.figure;

import javax.swing.*;
import java.awt.*;

class DrawCircle extends JFrame {

    public DrawCircle(){
        setTitle("Drawing a Circle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawOval(150, 150, 100, 100);

        g.drawOval(150, 130, 50, 50);
        g.drawOval(250, 130, 50, 50);
        g2d.drawOval(150, 150, 150, 140);
        g.drawOval(190, 200, 10, 10);
        g.drawOval(250, 200, 10, 10);
        g.drawOval(220, 230, 10, 10);

        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.blue);
        g.drawLine(100, 150, 300, 400);
    }

    public static void main(String[] args) {

        new DrawCircle();

    }
}
