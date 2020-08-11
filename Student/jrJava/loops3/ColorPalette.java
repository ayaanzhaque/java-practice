package jrJava.loops3;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class ColorPalette {

	public static void main(String[] args) {

		int i,j;
		int screensize = 700;
		int margin = 50;
		int numOfTiles = 20;
		int tileSize = (screensize -2*margin)/numOfTiles;
		int colorIncrement = 255/numOfTiles;
		int sleepTime = 5;
		Color color;
		
		DrawingBoard board = new DrawingBoard(200, 0, screensize, screensize);
		Graphics canvas = board.getCanvas();

		for(i = 0;i < numOfTiles; i++){
			
			for(j = 0; j < numOfTiles; j++){
				color = new Color(0,colorIncrement*i,colorIncrement*j);
				canvas.setColor(color);
				canvas.fillRect(margin + tileSize*i, margin + tileSize*j, tileSize, tileSize);
				canvas.setColor(Color.BLACK);
				canvas.drawRect(margin + tileSize*i, margin + tileSize*j, tileSize, tileSize);
				board.repaint();
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {}
			}
		}
		



	}

}
