package jrJava.imageManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic3 {

	public static void main(String[] args) throws IOException{

		BufferedImage bImage = ImageIO.read(new File("jrJava/imageManipulation/darthvader.png"));
		BufferedImage empty = new BufferedImage(bImage.getWidth(), bImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int i, j, color, modified;
		int a, r, g, b;
		for(i = 0; i < bImage.getWidth(); i++){
			for(j = 0; j < bImage.getHeight(); j++){
				color = bImage.getRGB(i, j);
				a = getAlpha(color);
				r = getRed(color) * 3/2;
				if(r > 255) r = 255;
				g = getGreen(color) * 4/3;
				if(g > 255) g = 255;
				b = getBlue(color);
				modified = getColor(a,r,g,b);
				empty.setRGB(i, j, modified);
			}
		}
			ImageIO.write(empty, "png", new File("jrJava/imageManipulation/darthvader2.png"));
	}
	
	private static int getAlpha(int color){
		return (color >> 24) & 0xff;
	}
	
	private static int getRed(int color){
		return (color >> 16) & 0xff;
	}
	
	private static int getGreen(int color){
		return (color >> 8) & 0xff;
	}
	
	private static int getBlue(int color){
		return color;
	}
	
	private static color getColor(){
		
	}

}
