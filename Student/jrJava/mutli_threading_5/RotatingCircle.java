package jrJava.mutli_threading_5;

import java.awt.Color;
import java.awt.Graphics;

import jrJava.fancyDrawingBoard.FancyDrawingBoard;

public class RotatingCircle {
	

	public static void main(String[] args) {
		
		FancyDrawingBoard board = new FancyDrawingBoard(200,0,600,600);
		
		Graphics g = board.getBufferedGraphics();
		
		ColorReader colorReader = new ColorReader();
		
		int arcSize = 30;
		int angle = 0;
		int radius = 1;
		
		new Thread(colorReader).start();
		
		while(true) {
			
			angle += arcSize;
			if(angle>=360) angle = 0;

			if(radius < 200) radius += 1;
			
			board.clear();
			g.setColor(colorReader.getColor());
			g.drawOval(300-radius, 300-radius, 2*radius, 2*radius);
			g.fillArc(300-radius, 300-radius, 2*radius, 2*radius, angle, arcSize);
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
			
			
		}
		
		
		
	}

}
