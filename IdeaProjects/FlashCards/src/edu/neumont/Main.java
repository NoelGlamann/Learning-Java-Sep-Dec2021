package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        boolean bool = false;
        FlashCard flashCard = new FlashCard();
        flashCard.reset();

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(100, 100, 200, 300);

        JLabel operand1Label = new JLabel(Integer.toString(flashCard.operand1));
        operand1Label.setBounds(120, 30, 100, 40);
        operand1Label.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(operand1Label);

        JLabel operand2Label = new JLabel(Integer.toString(flashCard.operand2));
        operand2Label.setBounds(120, 90, 100, 40);
        operand2Label.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(operand2Label);

        JLabel operatorLabel = new JLabel("+");
        operatorLabel.setBounds(80, 90, 100, 40);
        operatorLabel.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(operatorLabel);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(20, 200, 200, 20);
        resultLabel.setForeground(Color.red);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(resultLabel);

        JTextField answerTextField = new JTextField();
        answerTextField.setBounds(50, 150, 100, 40);
        answerTextField.setFont(new Font("Arial", Font.BOLD, 36));
        answerTextField.setHorizontalAlignment(JTextField.RIGHT);
        answerTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int textField = Integer.parseInt(answerTextField.getText());
                if (textField == flashCard.answer){
                    resultLabel.setText("");
                    flashCard.reset();
                    operand1Label.setText(Integer.toString(flashCard.operand1));
                    operand2Label.setText(Integer.toString(flashCard.operand2));
                    answerTextField.setText("");
                }
                else if (flashCard.tries == 1){
                    resultLabel.setText("Out of Tries");
                    answerTextField.setText(Integer.toString(flashCard.answer));
                    answerTextField.setEnabled(false);
                }
                else if (Math.abs(flashCard.answer - textField)<=2){
                    resultLabel.setText("Close!");
                    answerTextField.setText("");
                    flashCard.tries -= 1;
                }
                else{
                    resultLabel.setText("Incorrect.");
                    answerTextField.setText("");
                    flashCard.tries -= 1;

                }
            }
        });
        frame.add(answerTextField);

        JButton nextButton = new JButton("Next");
        nextButton.setBounds(70, 230, 100, 20);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flashCard.reset();
                operand1Label.setText(Integer.toString(flashCard.operand1));
                operand2Label.setText(Integer.toString(flashCard.operand2));
                resultLabel.setText("");
                answerTextField.setText("");
                answerTextField.setEnabled(true);
            }
        });
        frame.add(nextButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
