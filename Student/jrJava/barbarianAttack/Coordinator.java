package jrJava.barbarianAttack;

import java.awt.Graphics2D;

public class Coordinator {
	
	public static Arrow arrow;

	public static void main(String[] args) {

		FancyDrawingBoard board = new FancyDrawingBoard(0, 0, 1350, 700);
		Graphics2D g = (Graphics2D) board.getBufferedGraphics();

		Bow bow = new Bow(900, 350, 2.0, 0.0);
		board.addMouseListener(bow);
		board.addMouseMotionListener(bow);
		

		while(true){
			
			if(arrow != null) arrow.move();
			
			board.clear();
			bow.draw(g);
			if(arrow != null) arrow.draw(g);
			board.repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}

		}

	}
}
