package edu.neumont;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame("Happy Halloween!");
        frame.setBounds(100, 100, 800, 600);

        Canvas canvas = new Canvas();
        frame.add(canvas);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
