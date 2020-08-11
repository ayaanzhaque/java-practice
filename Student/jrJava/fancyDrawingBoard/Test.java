package jrJava.fancyDrawingBoard;

import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		
		MyJPanel panel = new MyJPanel(200, 50, 800, 600);

		CircleShape c = new CircleShape(100, 100, 80, Color.GREEN, 5, 3);
		SquareShape s = new SquareShape(400, 400, 120, Color.BLUE, -5, -3);
		
		//panel.setAppComponents(c, s);
		
		for(int i=0; i<20; i++){
			c.move();
			s.move();
			System.out.println("Main: " + Thread.currentThread().getId());
			panel.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
		}
		 
	}

}
