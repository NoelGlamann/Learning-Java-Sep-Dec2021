package edu.neumont;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Image {
    BufferedImage bufferedImage;
    Image(String filename){
        try {
            bufferedImage = ImageIO.read(new File("resources/" + filename));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    int getWidth(){
        return bufferedImage.getWidth();
    }
    int getHeight(){
        return bufferedImage.getHeight();
    }
}

