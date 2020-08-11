package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Graphics;

public class SquareShape {

	
	private int x, y;
	private int side;
	private Color color;
	private int dx, dy;
	
	public SquareShape(int x, int y, int side, Color color, int dx, int dy){
		this.x = x;
		this.y = y;
		this.side = side;
		this.color = color;
		this.dx = dx;
		this.dy = dy;
	}
	
	public void move(){
		x += dx;
		y += dy;
	}
	
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(x, y, side, side);
	}
	
}
