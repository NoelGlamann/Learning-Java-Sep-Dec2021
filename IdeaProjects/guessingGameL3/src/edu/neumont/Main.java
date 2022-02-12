//Noel Glamann
//Octbbbb

package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Pass pass = new Pass();
        pass.tries = 2;

        JFrame frame = new JFrame();
        frame.setBounds(200, 100, 400, 600);
        frame.setLayout(null);

        JLabel title = new JLabel("Guess the Number");
        title.setBounds(10, 10, 380, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(title);

        JLabel descrip = new JLabel("Set Bounds:");
        descrip.setBounds(30, 65, 370, 20);
        descrip.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(descrip);

        JTextField minBound = new JTextField();
        minBound.setBounds(125, 100, 50,50);
        frame.add(minBound);
        JTextField maxBound = new JTextField();
        maxBound.setBounds(225, 100, 50,50);
        frame.add(maxBound);

        JLabel minLabel = new JLabel("Min");
        minLabel.setBounds(130, 155, 50, 20);
        minLabel.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(minLabel);
        JLabel maxLabel = new JLabel("Max");
        maxLabel.setBounds(230, 155, 50, 20);
        maxLabel.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(maxLabel);

        JLabel divider = new JLabel("----------------------------");
        divider.setFont(new Font("Arial", Font.BOLD, 40));
        divider.setBounds(50, 250, 300, 20);
        frame.add(divider);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(150, 420, 200, 20);
        divider.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(resultLabel);


        JTextField numGuess = new JTextField();
        numGuess.setBounds(170, 300, 60, 50);
        numGuess.setEnabled(false);
        frame.add(numGuess);

        JButton guessButton = new JButton("Guess");
        guessButton.setBounds(150, 370, 100, 30);
        guessButton.setEnabled(false);
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(numGuess.getText());

                if (guess == pass.randNum){
                    resultLabel.setForeground(Color.green);
                    resultLabel.setText("CORRECT");
                    guessButton.setEnabled(false);
                }
                else if(pass.tries == 0){
                    resultLabel.setForeground(Color.red);
                    resultLabel.setText("Out of Guesses");
                    numGuess.setText(Integer.toString(pass.randNum));
                    numGuess.setEnabled(false);
                    guessButton.setEnabled(false);
                }
                else if (Math.abs(pass.randNum - guess)<=1){
                    resultLabel.setForeground(Color.black);
                    resultLabel.setText("CLOSE");
                    pass.tries -=1;
                }
                else{
                    resultLabel.setForeground(Color.blue);
                    resultLabel.setText("TRY AGAIN");
                    pass.tries -=1;
                }


            }
        });
        frame.add(guessButton);

        JButton startButton = new JButton("Start");
        startButton.setBounds(150, 190, 100, 30);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int minNum = Integer.parseInt(minBound.getText());
                 int maxNum = Integer.parseInt(maxBound.getText());

                 pass.randNum = generateRandom(minNum, maxNum);

                 numGuess.setEnabled(true);
                 guessButton.setEnabled(true);

                 startButton.setEnabled(false);
                 minBound.setEnabled(false);
                 maxBound.setEnabled(false);

            }
        });
        frame.add(startButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    static int generateRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max);
    }

}
