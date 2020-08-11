package homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Trial {

	public static void main(String[] args) {
		
		 
        DrawingBoard board = new DrawingBoard(0, 0, 1400, 800);
		Graphics canvas = board.getCanvas();
		
		calMon();
		
		
	}

	private static void calMon() {
		DrawingBoard board = new DrawingBoard(0, 0, 1400, 800);
		Graphics canvas = board.getCanvas();
		
		canvas.setFont(new Font("arial", Font.BOLD, 50));
		canvas.setColor(Color.black);
		canvas.drawString("November", 550, 35);
		board.repaint();
		
	}

}
