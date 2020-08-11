package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Graphics;

public class CircleShape {

	private int x, y;
	private int radius;
	private Color color;
	private int dx, dy;
	
	public CircleShape(int x, int y, int radius, Color color, int dx, int dy){
		this.x = x;
		this.y = y;
		this.radius = radius;
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
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
}








