package jrJava.imageManipulation2;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		BufferedImage bImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);

		JGraphics g = new JGraphics(bImage);
		g.setColor(0xffff0000);
		g.fillCircle(300, 300, 100);
		
		g.createFile("image2.png"); 
	}

}
 