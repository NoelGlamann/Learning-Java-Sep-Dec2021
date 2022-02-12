//Noel Glamann
//October 19, 2021
//Classy Calculator

package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

	    JFrame frame = new JFrame(); //FRAME CREATION
        frame.setLayout(null);
        frame.setBounds(200, 150, 450, 600);
        frame.getContentPane().setBackground(Color.pink);

        JLabel title = new JLabel("Classy Calculator");
        title.setForeground(Color.white);
        title.setFont(new Font("Serif", Font.PLAIN, 40));
        title.setBounds(10, 10, 300, 40);
        frame.add(title);

        //VALUE LABELS
        JLabel val1entLbl = new JLabel("Value 1: ");
        val1entLbl.setFont(new Font("Serif", Font.PLAIN, 20));
        val1entLbl.setBounds(50, 100, 80, 25);
        frame.add(val1entLbl);
        JLabel val2entLbl = new JLabel("Value 2: ");
        val2entLbl.setFont(new Font("Serif", Font.PLAIN, 20));
        val2entLbl.setBounds(50, 140, 80, 25);
        frame.add(val2entLbl);

        //VALUE ENTRIES
        JTextField value1entry = new JTextField();
        value1entry.setBounds(150, 100, 40, 25);
        frame.add(value1entry);
        JTextField value2entry = new JTextField();
        value2entry.setBounds(150, 140, 40, 25);
        frame.add(value2entry);

        //RANDOM AUTOFILL BUTTONS
        JButton randBut1 = new JButton("Autofill Random Value");
        randBut1.setFont(new Font("Serif", Font.PLAIN, 14));
        randBut1.setBounds(200, 105, 170, 15);
        randBut1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randInt = random.nextInt(0, 20);
                String string = Integer.toString(randInt);
                value1entry.setText(string);
            }
        });
        frame.add(randBut1);
        JButton randBut2 = new JButton("Autofill Random Value");
        randBut2.setFont(new Font("Serif", Font.PLAIN, 14));
        randBut2.setBounds(200, 145, 170, 15);
        randBut2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randInt = random.nextInt(0, 20);
                String string = Integer.toString(randInt);
                value2entry.setText(string);
            }
        });
        frame.add(randBut2);

        //CALCULATION LABELS
        JLabel addLbl = new JLabel("Added: ");
        addLbl.setBounds(50, 280, 100, 25);
        addLbl.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(addLbl);
        JLabel subLbl = new JLabel("Subtracted: ");
        subLbl.setBounds(50, 320, 100, 25);
        subLbl.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(subLbl);
        JLabel multLbl = new JLabel("Multiplied: ");
        multLbl.setBounds(50, 360, 100, 25);
        multLbl.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(multLbl);
        JLabel divLbl = new JLabel("Divided: ");
        divLbl.setBounds(50, 400, 100, 25);
        divLbl.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(divLbl);
        JLabel modLbl = new JLabel("Modulus: ");
        modLbl.setBounds(50, 440, 100, 25);
        modLbl.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(modLbl);

        //CALCULATION RESULT DISPLAY
        JLabel add = new JLabel();
        add.setBounds(150, 280, 100, 25);
        add.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(add);
        JLabel sub = new JLabel();
        sub.setBounds(150, 320, 100, 25);
        sub.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(sub);
        JLabel mult = new JLabel();
        mult.setBounds(150, 360, 100, 25);
        mult.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(mult);
        JLabel div = new JLabel();
        div.setBounds(150, 400, 100, 25);
        div.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(div);
        JLabel mod = new JLabel();
        mod.setBounds(150, 440, 100, 25);
        mod.setFont(new Font("Serif", Font.PLAIN, 17));
        frame.add(mod);

        //CALCULATE BUTTON
        JButton calculate = new JButton("CALCULATE");
        calculate.setBackground(Color.white);
        calculate.setForeground(Color.pink);
        calculate.setBounds(140, 200, 120, 30);
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val1str = value1entry.getText();
                String val2str = value2entry.getText();
                int v1 = Integer.parseInt(val1str);
                int v2 = Integer.parseInt(val2str);

                int addedVal = Helper.add(v1,v2);
                String added = Integer.toString(addedVal);
                int subVal = Helper.subtract(v1, v2);
                String subtracted = Integer.toString(subVal);
                int multVal = Helper.multiply(v1, v2);
                String multiplied = Integer.toString(multVal);
                int divVal = Helper.divide(v1, v2);
                String divided = Integer.toString(divVal);
                int modVal = Helper.modulus(v1, v2);
                String modded = Integer.toString(modVal);

                add.setText(added);
                sub.setText(subtracted);
                mult.setText(multiplied);
                div.setText(divided);
                mod.setText(modded);

            }
        });
        frame.add(calculate);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
