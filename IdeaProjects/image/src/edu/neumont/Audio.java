package edu.neumont;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    Clip clip;

    Audio(String filename){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("resources/"+filename)));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void play(){
        clip.start();
    }

}
