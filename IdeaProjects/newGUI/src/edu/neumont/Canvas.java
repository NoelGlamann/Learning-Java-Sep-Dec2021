package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Canvas extends JPanel implements ActionListener {

    Timer timer;

    Canvas() {
        timer = new Timer(15, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        //background
        Color color = (getRandom(0, 100) < 4) ? Color.white: Color.black;
        g2d.setPaint(color);
        g2d.fillRect(0,0,getWidth(), getHeight());

        //moon
        g2d.setPaint(Color.gray);
        g2d.fillOval(60, 60, 120, 120);

        //static
        g2d.setPaint(Color.white);
        for (int i = 0; i < 2000; i++){
            int x = getRandom(0, getWidth());
            int y = getRandom(0, getHeight());
            g2d.drawLine(x, y, x, y);
        }

        //lightning
        if (getRandom(0, 100)<7) {
            g2d.setStroke(new BasicStroke(5));
            g2d.setPaint(Color.white);
            int x = getRandom(0, getWidth());
            int y = 0;
            for (int i = 0; i < 12; i++) {
                int xo = getRandom(-50, 50);
                int yo = getRandom(20, 50);
                g2d.drawLine(x, y, x + xo, y + yo);
                x += xo;
                y += yo;
            }
        }

        //grass
        g2d.setPaint(new Color(0, getRandom(25, 60), 0));
        g2d.fillRect(0, 400, getWidth(), getHeight()-400);

        //ghost
        g2d.setPaint(Color.white);
        g2d.fillOval(250, 100, 300, 300);
        g2d.fillRect(250, 250, 300, 300);
        g2d.setPaint(Color.black);
        g2d.fillOval(300, 180, 60, 80);
        g2d.fillOval(430, 180, 60, 80);
        g2d.fillArc(300, 240, 200, 160, 180, 180);

        //title
        g2d.setPaint(new Color(getRandom(0,255), 0, 0));
        g2d.setFont(new Font("Times New Roman", Font.BOLD, 64));
        g2d.drawString("Happy Halloween!", 200, 150);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

}
