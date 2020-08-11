package jrJava.imageManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic1 {

	public static void main(String[] args) throws IOException{

		BufferedImage bImage = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);

		int i, j;
		for(i = 0; i < bImage.getWidth(); i++){
			for(j = 0; j < bImage.getHeight(); j++){
				int green = i/3;
				int red = j/2;
				bImage.setRGB(i, j, 0xff000000 | (green<<8) | (red<<16));
			}
		}

		ImageIO.write(bImage, "png", new File("jrJava/imageManipulation/test1.png"));

	}

}
