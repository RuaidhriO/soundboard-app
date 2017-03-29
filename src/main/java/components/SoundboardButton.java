package main.java.components;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
    @Author: ruaoneill
 */

public class SoundboardButton extends JButton implements ActionListener {

    public SoundboardButton(String text){
        super();
        setText(text);
        setForeground(Color.blue);
        addActionListener(this);

    };

    public void actionPerformed(ActionEvent e) {
        if ("play-sound".equals(e.getActionCommand())){
            try {
                String soundName42 = "src/main/resources/sounds/button-42.wav";
                AudioInputStream stream42 = AudioSystem.getAudioInputStream(new File(soundName42).getAbsoluteFile());
                Clip soundClip42 = AudioSystem.getClip();
                soundClip42.open(stream42);
                soundClip42.start();
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
        }
        else if ("play-sound-yeah".equals(e.getActionCommand())){
            try {
                String soundName = "src/main/resources/sounds/adrianClipYeah.wav";
                AudioInputStream stream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                Clip soundClip = AudioSystem.getClip();
                soundClip.open(stream);
                soundClip.start();
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
        }
    }
}
