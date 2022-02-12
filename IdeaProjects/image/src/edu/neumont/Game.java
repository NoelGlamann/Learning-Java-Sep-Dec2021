package edu.neumont;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Game {
    Game(){//Constructor
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 810, 810);
        frame.setLayout(null);

        Audio audio = new Audio("pickup.wav");
        audio.play();

        Image image = new Image("dice.png");

        JLabel diceImage = new JLabel(new ImageIcon(image.bufferedImage));
        diceImage.setBounds(10, 10, image.getWidth(), image.getHeight());
        frame.add(diceImage);

        Image buttonimage = new Image("button.png");
        JButton button = new JButton(new ImageIcon(buttonimage.bufferedImage));
        button.setBounds(40, 40, buttonimage.getWidth(), buttonimage.getHeight());
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



}
