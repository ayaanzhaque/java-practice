package jrJava.alienInvader2;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {

	private int x,y; // center top
	private int vy;  // vy must be negitive
	private static int width, height;
	private static Color color;
	private boolean isCollidedWithAlien, isCollidedWithMissile;
	private static Color explosionColorBig, explosionColorSmall;
	private static int explosionRadiusBig, explosionRadiusSmall;
	
	static {
		width = 4;
		height = 12;
		color = color.blue;
		explosionColorBig = Color.ORANGE;
		explosionColorSmall = Color.MAGENTA;
		explosionRadiusBig = 60;
		explosionRadiusSmall = 40;
	}
	
	
	public Torpedo(int _x, int _y, int _vy){
		x = _x;
		y = _y;
		vy = _vy;
		
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public static int getWidth() {return width;}
	public static int getHeight() {return height;}
	
	
	public void move(){
		y += vy;
		
		// Initiate collision checking
		if(Coordinator.alien!=null){
		isCollidedWithAlien = Coordinator.alien.isHit(this);}
		
		if(Coordinator.missile!=null){
			isCollidedWithMissile = Coordinator.missile.isHit(this);
		}
	}
	
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y, width, height);
		
		if(isCollidedWithAlien){
			canvas.setColor(explosionColorBig);
			canvas.drawOval(x-explosionRadiusBig, y-explosionRadiusBig, 120, 120);
			Coordinator.torpedo = null;
		}
		
		if(isCollidedWithMissile){
			canvas.setColor(explosionColorSmall);
			canvas.drawOval(x-explosionRadiusSmall, y-explosionRadiusSmall, 120, 120);
			Coordinator.torpedo = null;
			
		}
		
	}
	
	
	
	
}
