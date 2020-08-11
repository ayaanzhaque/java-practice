package jrJava.methodCall5_design;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class MoveBall {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200,50,800,600);
		move(board, Color.red, 80, 100, 100, 300, 300, 100);
		move(board, Color.red, 80, 850, 500, 100, 650, 100);
		move(board, Color.red, 80, 100, 650, 300, 300, 100);
	}
	
	
	public static void move(DrawingBoard board, Color color, int radius,int x1, int y1, int x2, int y2, int numOfMoves){
		
		Graphics canvas = board.getCanvas();
		int xC,yC;
		for(int i = 0; i < numOfMoves; i++){
			
			xC = (int) (x1 + ((double)x2-x1)/numOfMoves*i); // f(i)
			yC = (int) (y1 + ((double)y2-y1)/numOfMoves*i); // f(i)
			canvas.setColor(color);
			canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
			board.repaint();
			
			try {
				Thread.sleep(1000/numOfMoves);
			} catch (InterruptedException e) {}
		}
		
	}

}
