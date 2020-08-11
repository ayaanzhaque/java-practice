package jrJava.usingMouseMotionListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;

import resources.DrawingBoard;

public class Coordinator {

	public static void main(String[] args) {
		
		
		DrawingBoard board = new DrawingBoard(0,0,500,500);
		Graphics canvas = board.getCanvas();
		
		Box box = new Box(250,250,50,50,Color.BLACK);
		board.addMouseListener(box);
		
		while(true){
			
			board.clear();
			box.draw(canvas);
			board.repaint();
						
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
			
		}
		

	}

}
