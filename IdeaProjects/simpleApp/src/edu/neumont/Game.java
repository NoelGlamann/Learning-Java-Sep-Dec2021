package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Game {
    Game() {
        Count count = new Count();

        //GAME FRAME
        JFrame frame = new JFrame("Dice Game");
        frame.setBounds(100, 100, 800, 560);
        frame.setLayout(null);

        //SECOND FRAME WITH INSTRUCTIONS
        JFrame instructionsFrame = new JFrame("How to Play");
        instructionsFrame.setBounds(1000, 100, 300, 300);
        instructionsFrame.setLayout(null);
        JLabel instructionsTitle = new JLabel("Instructions");
        instructionsTitle.setBounds(10, 10, 180, 20);
        instructionsFrame.add(instructionsTitle);
        JLabel instructions = new JLabel("<html>" +
                "1. Roll your dice up to three times. <br>" +
                "2. Click on a dice to save it's value for the turn. <br>" +
                "3. When you are done rolling, select a button to the left to take it's value. <br>" +
                "4. Continue the process until all values to the left are filled, remember " +
                "if your roll doesn't qualify, you have to take a zero. <br>" +
                "5. To recieve the bonus, you must score 63 total points in the left column. <br>" +
                "6. At the end press complete to see your final score. Good Luck!");
        instructions.setBounds(25, 40, 250, 200);
        instructionsFrame.add(instructions);
        instructionsFrame.setVisible(true);

        JLabel title = new JLabel("Let's Play Dice");
        title.setBounds(20, 20, 300, 40);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(title);


        //LIST THAT TELLS WHICH DICE TO ROLL
        ArrayList<String> toRoll = new ArrayList<>();
        toRoll.add("dice1");
        toRoll.add("dice2");
        toRoll.add("dice3");
        toRoll.add("dice4");
        toRoll.add("dice5");


        //DICE BUTTONS
        JButton dice1 = new JButton();
        dice1.setBounds(400, 100, 90, 90);
        dice1.setFont(new Font("Arial", Font.BOLD, 40));
        dice1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toRoll.contains("dice1")) {
                    toRoll.remove("dice1");
                    dice1.setBackground(Color.gray);
                } else {
                    toRoll.add("dice1");
                    dice1.setBackground(null);
                }
            }
        });
        frame.add(dice1);
        JButton dice2 = new JButton();
        dice2.setBounds(500, 100, 90, 90);
        dice2.setFont(new Font("Arial", Font.BOLD, 40));
        dice2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toRoll.contains("dice2")) {
                    toRoll.remove("dice2");
                    dice2.setBackground(Color.gray);
                } else {
                    toRoll.add("dice2");
                    dice2.setBackground(null);
                }
            }
        });
        frame.add(dice2);
        JButton dice3 = new JButton();
        dice3.setBounds(600, 100, 90, 90);
        dice3.setFont(new Font("Arial", Font.BOLD, 40));
        dice3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toRoll.contains("dice3")) {
                    toRoll.remove("dice3");
                    dice3.setBackground(Color.gray);
                } else {
                    toRoll.add("dice3");
                    dice3.setBackground(null);
                }
            }
        });
        frame.add(dice3);
        JButton dice4 = new JButton();
        dice4.setBounds(450, 200, 90, 90);
        dice4.setFont(new Font("Arial", Font.BOLD, 40));
        dice4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toRoll.contains("dice4")) {
                    toRoll.remove("dice4");
                    dice4.setBackground(Color.gray);
                } else {
                    toRoll.add("dice4");
                    dice4.setBackground(null);
                }
            }
        });
        frame.add(dice4);
        JButton dice5 = new JButton();
        dice5.setBounds(550, 200, 90, 90);
        dice5.setFont(new Font("Arial", Font.BOLD, 40));
        dice5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toRoll.contains("dice5")) {
                    toRoll.remove("dice5");
                    dice5.setBackground(Color.gray);
                } else {
                    toRoll.add("dice5");
                    dice5.setBackground(null);
                }
            }
        });
        frame.add(dice5);

        JLabel totalsLabel = new JLabel("Total Scores:");
        totalsLabel.setBounds(10, 395, 170, 20);
        frame.add(totalsLabel);

        JLabel leftScore = new JLabel("0");
        leftScore.setBounds(90, 420, 50, 40);
        leftScore.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(leftScore);
        JLabel rightScore = new JLabel("0");
        rightScore.setBounds(240, 420, 50, 40);
        rightScore.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(rightScore);

        JLabel bonus = new JLabel("");
        bonus.setBounds(50, 350, 130, 40);
        bonus.setForeground(Color.green);
        frame.add(bonus);

        JLabel gameTotalLabel = new JLabel("Game Total: ");
        gameTotalLabel.setFont(new Font("Arial", Font.BOLD, 15));
        gameTotalLabel.setBounds(390, 460, 100, 20);
        frame.add(gameTotalLabel);
        JLabel gameTotal = new JLabel("0");
        gameTotal.setFont(new Font("Arial", Font.BOLD, 25));
        gameTotal.setBounds(500, 453, 50, 40);
        frame.add(gameTotal);

        JButton completeButton = new JButton("Complete Game");
        completeButton.setBounds(650,480, 130, 40);
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame endFrame = new JFrame();
                endFrame.setBounds(500, 300, 450, 450);
                endFrame.setLayout(null);

                int totalGamePoints = Integer.parseInt(gameTotal.getText());
                int bonusPoints = 0;
                if (bonus.getText() == "Bonus Achieved (+35)"){
                    bonusPoints = 35;
                }
                totalGamePoints += bonusPoints;

                JLabel finalPointLabel = new JLabel("Final Score");
                finalPointLabel.setBounds(100, 150, 280, 40);
                finalPointLabel.setFont(new Font("Airal", Font.BOLD, 45));
                endFrame.add(finalPointLabel);
                JLabel finalPoints = new JLabel(Integer.toString(totalGamePoints));
                finalPoints.setBounds(200, 250, 130, 50);
                finalPoints.setFont(new Font("Airal", Font.BOLD, 45));
                endFrame.add(finalPoints);

                endFrame.setVisible(true);
                endFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
        frame.add(completeButton);

        //ROLL BUTTON
        JButton rollButton = new JButton("ROLL");
        rollButton.setBounds(490, 310, 120, 50);
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count.tries -= 1;
                if (count.tries == 0) {
                    rollButton.setEnabled(false);
                }
                if (toRoll.contains("dice1")) {
                    dice1.setText(Integer.toString(count.getRandom()));
                }
                if (toRoll.contains("dice2")) {
                    dice2.setText(Integer.toString(count.getRandom()));
                }
                if (toRoll.contains("dice3")) {
                    dice3.setText(Integer.toString(count.getRandom()));
                }
                if (toRoll.contains("dice4")) {
                    dice4.setText(Integer.toString(count.getRandom()));
                }
                if (toRoll.contains("dice5")) {
                    dice5.setText(Integer.toString(count.getRandom()));
                }

            }
        });
        frame.add(rollButton);

        //SCORING BUTTONS
        JButton onesButton = new JButton("Ones");
        onesButton.setBounds(50, 80, 130, 40);
        onesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Counts up the total number of ones.
                if (value1 == 1) {
                    total += 1;
                }
                if (value2 == 1) {
                    total += 1;
                }
                if (value3 == 1) {
                    total += 1;
                }
                if (value4 == 1) {
                    total += 1;
                }
                if (value5 == 1) {
                    total += 1;
                }
                onesButton.setText(Integer.toString(total));
                onesButton.setEnabled(false);
                int current = Integer.parseInt(leftScore.getText());
                int update = current + total;
                leftScore.setText(Integer.toString(update));

                if (update>=63) {
                    bonus.setText("Bonus Achieved (+35)");
                }

                int currentRight = Integer.parseInt(rightScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentRight, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);


            }
        });
        frame.add(onesButton);
        JButton twosButton = new JButton("Twos");
        twosButton.setBounds(50, 125, 130, 40);
        twosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Counts up the total number of twos.
                if (value1 == 2) {
                    total += 2;
                }
                if (value2 == 2) {
                    total += 2;
                }
                if (value3 == 2) {
                    total += 2;
                }
                if (value4 == 2) {
                    total += 2;
                }
                if (value5 == 2) {
                    total += 2;
                }
                twosButton.setText(Integer.toString(total));
                twosButton.setEnabled(false);
                int current = Integer.parseInt(leftScore.getText());
                int update = current + total;
                leftScore.setText(Integer.toString(update));

                if (update>=63) {
                    bonus.setText("Bonus Achieved (+35)");
                }

                int currentRight = Integer.parseInt(rightScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentRight, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(twosButton);
        JButton threesButton = new JButton("Threes");
        threesButton.setBounds(50, 170, 130, 40);
        threesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Counts up the total number of threes.
                if (value1 == 3) {
                    total += 3;
                }
                if (value2 == 3) {
                    total += 3;
                }
                if (value3 == 3) {
                    total += 3;
                }
                if (value4 == 3) {
                    total += 3;
                }
                if (value5 == 3) {
                    total += 3;
                }
                threesButton.setText(Integer.toString(total));
                threesButton.setEnabled(false);
                int current = Integer.parseInt(leftScore.getText());
                int update = current + total;
                leftScore.setText(Integer.toString(update));

                if (update>=63) {
                    bonus.setText("Bonus Achieved (+35)");
                }

                int currentRight = Integer.parseInt(rightScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentRight, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(threesButton);
        JButton foursButton = new JButton("Fours");
        foursButton.setBounds(50, 215, 130, 40);
        foursButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Counts up the total number of fours.
                if (value1 == 4) {
                    total += 4;
                }
                if (value2 == 4) {
                    total += 4;
                }
                if (value3 == 4) {
                    total += 4;
                }
                if (value4 == 4) {
                    total += 4;
                }
                if (value5 == 4) {
                    total += 4;
                }
                foursButton.setText(Integer.toString(total));
                foursButton.setEnabled(false);
                int current = Integer.parseInt(leftScore.getText());
                int update = current + total;
                leftScore.setText(Integer.toString(update));

                if (update>=63) {
                    bonus.setText("Bonus Achieved (+35)");
                }

                int currentRight = Integer.parseInt(rightScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentRight, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(foursButton);
        JButton fivesButton = new JButton("Fives");
        fivesButton.setBounds(50, 260, 130, 40);
        fivesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Counts up the total number of fives.
                if (value1 == 5) {
                    total += 5;
                }
                if (value2 == 5) {
                    total += 5;
                }
                if (value3 == 5) {
                    total += 5;
                }
                if (value4 == 5) {
                    total += 5;
                }
                if (value5 == 5) {
                    total += 5;
                }
                fivesButton.setText(Integer.toString(total));
                fivesButton.setEnabled(false);
                int current = Integer.parseInt(leftScore.getText());
                int update = current + total;
                leftScore.setText(Integer.toString(update));

                if (update>=63) {
                    bonus.setText("Bonus Achieved (+35)");
                }

                int currentRight = Integer.parseInt(rightScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentRight, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(fivesButton);
        JButton sixesButton = new JButton("Sixes");
        sixesButton.setBounds(50, 305, 130, 40);
        sixesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Counts up the total number of sixes.
                if (value1 == 6) {
                    total += 6;
                }
                if (value2 == 6) {
                    total += 6;
                }
                if (value3 == 6) {
                    total += 6;
                }
                if (value4 == 6) {
                    total += 6;
                }
                if (value5 == 6) {
                    total += 6;
                }
                sixesButton.setText(Integer.toString(total));
                sixesButton.setEnabled(false);
                int current = Integer.parseInt(leftScore.getText());
                int update = current + total;
                leftScore.setText(Integer.toString(update));

                if (update>=63) {
                    bonus.setText("Bonus Achieved (+35)");
                }

                int currentRight = Integer.parseInt(rightScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentRight, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(sixesButton);

        JButton thrKButt = new JButton("Three of a Kind");
        thrKButt.setBounds(200, 80, 130, 40);
        thrKButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int[] counts = {0, 0, 0, 0, 0, 0};
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Makes an array to determine how much of each number exists in the players roll.
                for (int i = 0; i < 6; i++) {
                    if (value1 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value2 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value3 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value4 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value5 == i + 1) {
                        counts[i] += 1;
                    }
                }
                //if there is a 3oK, this finds it and determines the points
                for (int i = 0; i < 6; i++) {
                    if (counts[i] >= 3) {
                        total += ((i + 1) * counts[i]);
                        for (int c = 0; c < 6; c++) {
                            if (c != i) {
                                total += ((c + 1) * counts[c]);
                            }
                        }
                    }
                }
                thrKButt.setText(Integer.toString(total));
                thrKButt.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(thrKButt);
        JButton frKButt = new JButton("Four of a Kind");
        frKButt.setBounds(200, 125, 130, 40);
        frKButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int[] counts = {0, 0, 0, 0, 0, 0};
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                //Makes array with the count of each number exists in the roll
                for (int i = 0; i < 6; i++) {
                    if (value1 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value2 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value3 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value4 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value5 == i + 1) {
                        counts[i] += 1;
                    }
                }
                //if there is a 4oK, finds it and determines points
                for (int i = 0; i < 6; i++) {
                    if (counts[i] >= 4) {
                        total += ((i + 1) * counts[i]);
                        for (int c = 0; c < 6; c++) {
                            if (c != i) {
                                total += ((c + 1) * counts[c]);
                            }
                        }
                    }
                }
                frKButt.setText(Integer.toString(total));
                frKButt.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(frKButt);
        JButton fhButt = new JButton("Full House");
        fhButt.setBounds(200, 170, 130, 40);
        fhButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int[] counts = {0, 0, 0, 0, 0, 0};
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                for (int i = 0; i < 6; i++) {
                    if (value1 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value2 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value3 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value4 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value5 == i + 1) {
                        counts[i] += 1;
                    }
                }
                for (int i = 0; i < 6; i++) {
                    if (counts[i] == 3) {
                        for (int c = 0; c < 6; c++) {
                            if (counts[c] == 2) {
                                total = 25;
                            }
                        }
                    }
                }
                fhButt.setText(Integer.toString(total));
                fhButt.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(fhButt);
        JButton smStrButt = new JButton("Small Straight");
        smStrButt.setBounds(200, 215, 130, 40);
        smStrButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int[] counts = {0, 0, 0, 0, 0, 0};
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                for (int i = 0; i < 6; i++) {
                    if (value1 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value2 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value3 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value4 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value5 == i + 1) {
                        counts[i] = 1;
                    }
                }
                int counter = 0;
                for (int i = 0; i < 6; i++) {
                    if (counts[i] == 1) {
                        counter += 1;
                    } else {
                        counter = 0;
                    }
                    if (counter == 4) {
                        total = 30;
                        break;
                    }

                }
                smStrButt.setText(Integer.toString(total));
                smStrButt.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(smStrButt);
        JButton lgStrButt = new JButton("Large Straight");
        lgStrButt.setBounds(200, 260, 130, 40);
        lgStrButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int[] counts = {0, 0, 0, 0, 0, 0};
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                for (int i = 0; i < 6; i++) {
                    if (value1 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value2 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value3 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value4 == i + 1) {
                        counts[i] = 1;
                    }
                    if (value5 == i + 1) {
                        counts[i] = 1;
                    }
                }
                int counter = 0;
                for (int i = 0; i < 6; i++) {
                    if (counts[i] == 1) {
                        counter += 1;
                    } else {
                        counter = 0;
                    }
                    if (counter == 5) {
                        total = 40;
                        break;
                    }

                }
                lgStrButt.setText(Integer.toString(total));
                lgStrButt.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(lgStrButt);
        JButton chance = new JButton("Chance");
        chance.setBounds(200, 305, 130, 40);
        chance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                int total = value1 + value2 + value3 + value4 + value5;

                chance.setText(Integer.toString(total));
                chance.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(chance);
        JButton yahtzee = new JButton("YAHTZEE");
        yahtzee.setBounds(200, 350, 130, 40);
        yahtzee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                int[] counts = {0, 0, 0, 0, 0, 0};
                int value1 = Integer.parseInt(dice1.getText());
                int value2 = Integer.parseInt(dice2.getText());
                int value3 = Integer.parseInt(dice3.getText());
                int value4 = Integer.parseInt(dice4.getText());
                int value5 = Integer.parseInt(dice5.getText());
                for (int i = 0; i < 6; i++) {
                    if (value1 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value2 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value3 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value4 == i + 1) {
                        counts[i] += 1;
                    }
                    if (value5 == i + 1) {
                        counts[i] += 1;
                    }
                }
                for (int i = 0; i < 6; i++) {
                    if (counts[i] == 5) {
                        total = 50;
                        break;
                    } else {
                        total = 0;
                    }
                }
                yahtzee.setText(Integer.toString(total));
                yahtzee.setEnabled(false);
                int current = Integer.parseInt(rightScore.getText());
                int update = current + total;
                rightScore.setText(Integer.toString(update));

                int currentLeft = Integer.parseInt(leftScore.getText());
                gameTotal.setText(Integer.toString(currentTotal(currentLeft, update)));

                dice1.setText("");
                dice1.setBackground(null);
                dice2.setText("");
                dice2.setBackground(null);
                dice3.setText("");
                dice3.setBackground(null);
                dice4.setText("");
                dice4.setBackground(null);
                dice5.setText("");
                dice5.setBackground(null);
                count.tries = 3;
                rollButton.setEnabled(true);
                resetToRoll(toRoll);
            }
        });
        frame.add(yahtzee);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    static ArrayList resetToRoll(ArrayList toRoll){
        toRoll.clear();
        toRoll.add("dice1");
        toRoll.add("dice2");
        toRoll.add("dice3");
        toRoll.add("dice4");
        toRoll.add("dice5");
        return toRoll;
    }
    static int currentTotal(int left, int right){
        return left + right;
    }
}
