package jr.JavagraphicsBasic;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Practiec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics canvas = board.getCanvas();
		canvas.setColor(Color.blue);
		canvas.fillRect(300, 100, 400, 200);
		board.repaint();
	}

}
