package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Graphics;

public class Test2 {

	public static void main(String[] args) {
		
		FancyDrawingBoard board = new FancyDrawingBoard(200, 50, 800, 600);
		Graphics bufferedG = board.getBufferedGraphics();
		Graphics transG = board.getTransGraphics();
		
		CircleShape c1 = new CircleShape(100, 100, 80, Color.GREEN, 5, 3);
		CircleShape c2 = new CircleShape(300, 400, 80, Color.RED, 5, 3);
		CircleShape c3 = new CircleShape(200, 300, 80, Color.ORANGE, 5, 3);
		SquareShape s = new SquareShape(400, 400, 120, Color.BLUE, -5, -3);
		
		board.clear();
		c1.draw(bufferedG);
		c2.draw(bufferedG);
		c3.draw(bufferedG);
		
		for(int i=0; i<200; i++){
			s.move();
			board.clearTrans();
			s.draw(transG);
			
			board.repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
		}
			
	}

	
}
