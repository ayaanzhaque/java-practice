package jr.JavagraphicsBasic;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Practice2 {
	
	
	public static void main(String[] args) {

	
	DrawingBoard board = new DrawingBoard(200,100,700,500);
	Graphics canvas= board.getCanvas();
	canvas.setColor(Color.blue);
	canvas.drawLine(0,0,700,500);
	canvas.setColor(Color.green);
	canvas.fillRect(100, 300, 150, 150);
	canvas.setColor(Color.red);
	canvas.fillOval(350, 50, 400, 400);
	
	board.repaint();
	
	
	}
}
