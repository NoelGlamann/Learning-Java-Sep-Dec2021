package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 400, 400); //location and size
        frame.setLayout(null);

        JTextField firstName = new JTextField();
        firstName.setBounds(100, 100, 200, 30);
        firstName.setBackground(Color.pink);
        frame.add(firstName);

        JTextField lastName = new JTextField();
        lastName.setBounds(100, 150, 200, 30);
        lastName.setBackground(Color.pink);
        frame.add(lastName);

        JLabel nameLabel = new JLabel("XXXX");
        nameLabel.setBounds(100, 200, 200, 30);
        frame.add(nameLabel);

        JButton button = new JButton("Run");
        button.setBounds(100, 250, 200, 30);
        button.setBackground(Color.cyan);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String first = firstName.getText();
                String last = lastName.getText();
                String greeting = "Hello " + first + " " + last + "!";
                nameLabel.setText(greeting);
            }
        });
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
