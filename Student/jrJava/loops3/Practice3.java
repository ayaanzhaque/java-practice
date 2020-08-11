package jrJava.loops3;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Practice3 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics canvas = board.getCanvas();
		int pauseTime = 10;
		int i, k;
		int xC, yC, radius = 100;
		for (k = 0; k < 100; k++){
			for(i = 0 ; i <= 100 ;i++){
				board.clear();
				xC = 100 + 6*i;
				yC = 100;
				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
				board.repaint();
				try {
					Thread.sleep(pauseTime);
				} catch (InterruptedException e) {}
			}
			for(i = 0 ; i <= 100 ;i++){
				board.clear();
				xC = 700;
				yC = 100 + 4*i;
				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
				board.repaint();
				try {
					Thread.sleep(pauseTime);
				} catch (InterruptedException e) {}
			}
			for(i = 0 ; i <= 100 ; i++){
				board.clear();
				xC = 700 - 6*i;
				yC = 500;
				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
				board.repaint();
				try {
					Thread.sleep(pauseTime);
				} catch (InterruptedException e) {}
			}
			for(i = 0 ; i <= 100 ;i++){
				board.clear();
				xC = 100;
				yC = 500 - 4*i;
				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
				board.repaint();
				try {
					Thread.sleep(pauseTime);
				} catch (InterruptedException e) {}
			}
		}

	}

}
