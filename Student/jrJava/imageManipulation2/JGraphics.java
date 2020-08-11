package jrJava.imageManipulation2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JGraphics {

	private BufferedImage bImage;
	private int color;
	
	public JGraphics(BufferedImage bImage){
		this.bImage = bImage;
	}
	
	public void setColor(int color){
		this.color = color;
	}
	
	public void fillCircle(int xC, int yC, int radius){
		
		int i, j;
		double d;
		for(i=0; i<bImage.getWidth(); i++){
			for(j=0; j<bImage.getHeight(); j++){
				d = Math.sqrt( (i-xC)*(i-xC) + (j-yC)*(j-yC) );
				
				if(d<radius){
					bImage.setRGB(i, j, color); 
				}
				else if(d<radius+1){
					double delta = d - radius; // 0<delta<1
					
					int r = color>>16 & 0xff; 
					int g = color>>8 & 0xff;
					int b = color & 0xff;
					
					int br = 255; // 0xff;
					int bg = 255;
					int bb = 255;
					
					int red = (int)(delta*br + (1-delta)*r);
					int green = (int)(delta*bg + (1-delta)*g);
					int blue = (int)(delta*bb + (1-delta)*b);
					
					bImage.setRGB(i, j, 0xff000000 | red<<16 | green << 8 | blue); 
				}
				
			}
		}
	} 
	
	
	public void createFile(String fileName) throws IOException{
		ImageIO.write(bImage, "png", new File("jrJava/imageManipulation2/" + fileName));
	}
	
}



