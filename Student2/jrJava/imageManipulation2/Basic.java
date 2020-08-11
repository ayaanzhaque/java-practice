package jrJava.imageManipulation2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Basic {

	
	public static void main(String[] args) throws IOException {
		
		BufferedImage bImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
		
		Graphics g = bImage.getGraphics();
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.RED);
		g.fillOval(200, 200, 200, 200);
		
		ImageIO.write(bImage, "png", new File("jrJava/imageManipulation2/image1.png"));
	}

}
