package main.java;

import main.java.components.SoundboardButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    @Author: ruaoneill
 */

public class SoundboardMain {

    public SoundboardMain(){};

    public void createAndShowGUI() {

        /*
            JFrame Creation
         */

        JFrame applicationFrame = new JFrame("Soundboard App Main");
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.setSize(800, 400);

        /*
            Adding JPanel
         */

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 5));

        /*
            Adding components
         */

        JLabel glueLabel1 = new JLabel();
        buttonPanel.add(glueLabel1);

        JLabel glueLabel2 = new JLabel();
        buttonPanel.add(glueLabel2);

        JLabel titleLabel = new JLabel("Soundboard Application");
        buttonPanel.add(titleLabel);

        JLabel glueLabel3 = new JLabel();
        buttonPanel.add(glueLabel3);

        JLabel glueLabel4 = new JLabel();
        buttonPanel.add(glueLabel4);

        SoundboardButton buttonOne = new SoundboardButton("Button One");
        buttonOne.setActionCommand("play-sound");
        buttonPanel.add(buttonOne);

        JLabel glueLabel5 = new JLabel();
        buttonPanel.add(glueLabel5);

        SoundboardButton buttonTwo = new SoundboardButton("Button Two");
        buttonTwo.setActionCommand("play-sound-yeah");
        buttonPanel.add(buttonTwo);

        JLabel glueLabel6 = new JLabel();
        buttonPanel.add(glueLabel6);

        SoundboardButton buttonThree = new SoundboardButton("Button Three");
        buttonPanel.add(buttonThree);

        SoundboardButton buttonFour = new SoundboardButton("Button Four");
        buttonPanel.add(buttonFour);

        JLabel glueLabel7 = new JLabel();
        buttonPanel.add(glueLabel7);

        SoundboardButton buttonFive = new SoundboardButton("Button Five");
        buttonPanel.add(buttonFive);

        JLabel glueLabel8 = new JLabel();
        buttonPanel.add(glueLabel8);

        SoundboardButton buttonSix = new SoundboardButton("Button Six");
        buttonPanel.add(buttonSix);

        /*
            Making JFrame visible
         */

        //applicationFrame.pack();
        applicationFrame.getContentPane().add(buttonPanel);
        applicationFrame.setVisible(true);
    }
}
