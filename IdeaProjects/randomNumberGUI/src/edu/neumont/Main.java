//Noel Glamann  10/18/2021
//Random Number Generating GUI

package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame();
        frame.setBounds(220, 150, 400, 400);
        frame.setLayout(null);

        JLabel title = new JLabel("Random Number Generator");
        title.setFont(new Font("Serif", Font.PLAIN, 16));
        title.setBounds(110, 20, 200, 30);
        frame.add(title);

        JTextField min = new JTextField();
        min.setBounds(140, 80, 40, 40 );
        frame.add(min);

        JTextField max = new JTextField();
        max.setBounds(220, 80, 40, 40 );
        frame.add(max);

        JLabel minLabel = new JLabel("MIN");
        minLabel.setBounds(145, 125, 30, 20);
        frame.add(minLabel);

        JLabel maxLabel = new JLabel("MAX");
        maxLabel.setBounds(225, 125, 30, 20);
        frame.add(maxLabel);

        JLabel result = new JLabel();
        result.setBounds(180, 220, 40, 40);
        result.setFont(new Font("Serif", Font.PLAIN, 40));
        frame.add(result);

        JButton run = new JButton("RUN");
        run.setBounds(170, 160, 60, 30);
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String minString = min.getText();
                String maxString = max.getText();
                int minNum = Integer.parseInt(minString);
                int maxNum = Integer.parseInt(maxString);

                if (minNum >= maxNum){
                    result.setText("Invalid. Minimum must be less than Maximum.");
                }
                else{
                    Random random = new Random();
                    int r = random.nextInt(minNum, maxNum);

                    String randNum = Integer.toString(r);
                    result.setText(randNum);
                }
            }
        });
        frame.add(run);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
