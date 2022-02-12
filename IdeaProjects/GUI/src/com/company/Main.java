package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        //creates frame
        JFrame frame = new JFrame();
        frame.setLocation(200, 200);
        frame.setSize(400, 400);
        frame.setLayout(null);

        //labels!
        JLabel label = new JLabel("Hello World!");
        label.setBounds(163, 50, 74, 20);
        frame.add(label);

        //buttons!
        JButton button = new JButton("0");
        button.setBounds(163, 200, 74, 50);
        button.setBackground(Color.PINK);
        //function for when button is clicked
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //creates a string with the text currently in the button
                String string = button.getText();
                //converts the string to an integer
                int click = Integer.parseInt(string);
                //adds one
                click++;
                //converts integer back to string
                String buttonText = Integer.toString(click);
                //changes text in button
                button.setText(buttonText);
            }
        });
        frame.add(button);

        //area to type text in
        JTextField textField = new JTextField();
        textField.setBounds(163, 300, 74, 50);
        //background color!
        textField.setBackground(Color.CYAN);
        frame.add(textField);

        //makes frame and contents visible
        frame.setVisible(true);

        //ends the program when frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
