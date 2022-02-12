//Noel Glamann
//October 14, 2021
//Mad Libs Class Assignment

package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static boolean inputs = true;

    public static void main(String[] args) {


        //frame for mad libs
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 500, 800);
        frame.setLayout(null);

        JLabel label = new JLabel("Make a Mad Lib!");//TITLE
        label.setBounds(80, 50, 400, 40);
        label.setFont(new Font("Serif", Font.PLAIN, 40));
        frame.add(label);

        JLabel instructions = new JLabel("Fill in the boxes and push go.");//INSTRUCTIONS
        instructions.setBounds(80, 100, 400, 30);
        instructions.setVisible(inputs);
        frame.add(instructions);
        //underline
        edu.neumont.Console.displayLine();

        //1
        JLabel entry1Label = new JLabel("Adjective: ");
        entry1Label.setBounds(150, 150, 100, 30);
        frame.add(entry1Label);
        JTextField entry1 = new JTextField();
        entry1.setBounds(250, 150, 100, 30);
        frame.add(entry1);

        //2
        JLabel entry2Label = new JLabel("Name: ");
        entry2Label.setBounds(150, 185, 100, 30);
        frame.add(entry2Label);
        JTextField entry2 = new JTextField();
        entry2.setBounds(250, 185, 100, 30);
        frame.add(entry2);

        //3
        JLabel entry3Label = new JLabel("Noun: ");
        entry3Label.setBounds(150, 220, 100, 30);
        frame.add(entry3Label);
        JTextField entry3 = new JTextField();
        entry3.setBounds(250, 220, 100, 30);
        frame.add(entry3);

        //4
        JLabel entry4Label = new JLabel("Shape: ");
        entry4Label.setBounds(150, 255, 100, 30);
        frame.add(entry4Label);
        JTextField entry4 = new JTextField();
        entry4.setBounds(250, 255, 100, 30);
        frame.add(entry4);

        //5
        JLabel entry5Label = new JLabel("Adjective: ");
        entry5Label.setBounds(150, 290, 100, 30);
        frame.add(entry5Label);
        JTextField entry5 = new JTextField();
        entry5.setBounds(250, 290, 100, 30);
        frame.add(entry5);

        //6
        JLabel entry6Label = new JLabel("Plural Noun: ");
        entry6Label.setBounds(150, 325, 100, 30);
        frame.add(entry6Label);
        JTextField entry6 = new JTextField();
        entry6.setBounds(250, 325, 100, 30);
        frame.add(entry6);

        //7
        JLabel entry7Label = new JLabel("Noun: ");
        entry7Label.setBounds(150, 360, 100, 30);
        frame.add(entry7Label);
        JTextField entry7 = new JTextField();
        entry7.setBounds(250, 360, 100, 30);
        frame.add(entry7);

        //8
        JLabel entry8Label = new JLabel("Number: ");
        entry8Label.setBounds(150, 395, 100, 30);
        frame.add(entry8Label);
        JTextField entry8 = new JTextField();
        entry8.setBounds(250, 395, 100, 30);
        frame.add(entry8);

        //9
        JLabel entry9Label = new JLabel("Shapes: ");
        entry9Label.setBounds(150, 430, 100, 30);
        frame.add(entry9Label);
        JTextField entry9 = new JTextField();
        entry9.setBounds(250, 430, 100, 30);
        frame.add(entry9);



        JButton button = new JButton("GO!");
        button.setBounds(210, 600, 80, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputs = false; //this makes the inputs all disappear so I can put the mad lib on the screen
                instructions.setVisible(inputs);
                entry1Label.setVisible(inputs);
                entry1.setVisible(inputs);
                entry2Label.setVisible(inputs);
                entry2.setVisible(inputs);
                entry3Label.setVisible(inputs);
                entry3.setVisible(inputs);
                entry4Label.setVisible(inputs);
                entry4.setVisible(inputs);
                entry5Label.setVisible(inputs);
                entry5.setVisible(inputs);
                entry6Label.setVisible(inputs);
                entry6.setVisible(inputs);
                entry7Label.setVisible(inputs);
                entry7.setVisible(inputs);
                entry8Label.setVisible(inputs);
                entry8.setVisible(inputs);
                entry9Label.setVisible(inputs);
                entry9.setVisible(inputs);

                String firstEntry = entry1.getText();
                String secondEntry = entry2.getText();
                String thirdEntry = entry3.getText();
                String fourthEntry = entry4.getText();
                String fifthEntry = entry5.getText();
                String sixthEntry = entry6.getText();
                String seventhEntry = entry7.getText();
                String numberEntry = entry8.getText();
                int eighthEntry = Integer.parseInt(numberEntry);
                eighthEntry *= 2;
                String ninthEntry = entry9.getText();

                String Sentence = "Pizza was invented by a "+firstEntry+" chef \nnamed "+secondEntry+". ";
                Sentence += "To make a pizza, \ntake a lump of "+thirdEntry+" and make a \nthin, round "+fourthEntry+". ";
                Sentence += "Then you \ncover it with "+fifthEntry+" sauce, cheese, \nand fresh cut "+sixthEntry+". ";
                Sentence += "Next, bake \nit in a hot "+seventhEntry+". ";
                Sentence += "When it's done, cut \nit into "+eighthEntry+" "+ninthEntry+".";

                JTextArea madlib = new JTextArea(Sentence);
                madlib.setFont(new Font("Serif", Font.PLAIN, 20));
                madlib.setBounds(80, 150, 340, 300);
                frame.add(madlib);

                label.setText("Pizza Party!");
                button.setVisible(inputs);


            }
        });
        frame.add(button);



        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
