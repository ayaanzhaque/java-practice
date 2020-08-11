package jrJava.alienInvader5_polymorphism;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Torpedo {

	private int x, y; // center, top
	private int vy; // vy<0
	private static int width, height;
	//private static Color color;
	private static Image image;
	private boolean isCollidedWithAlien, isCollidedWithMissile;
	private static Image explosion;
	
	
	static {
		
		image = new ImageIcon(Coordinator.R_PATH + "torpedo.png").getImage();
		explosion = new ImageIcon(Coordinator.R_PATH + "explosion.png").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		//color = Color.blue;
		
	}
		
	public Torpedo(int x, int y, int vy){
		this.x = x;
		this.y = y;
		this.vy = vy;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return width; }
	public static int getHeight(){ return height; }
	public static Image getExplosion() { return explosion;}
	
	
	public void move(){
		y += vy; 
		
		if(y<30) TorpedoManager.remove(this); 
		
		isCollidedWithAlien = AlienManager.isHit(this);
		isCollidedWithMissile = MissileManager.isHit(this);
	}
	
	
	
	public void draw(Graphics canvas){
		//canvas.setColor(color);
		//canvas.drawRect(x-width/2, y, width, height); 
		canvas.drawImage(image, x+width/2, y, null);
		
		if(isCollidedWithAlien){
			canvas.drawImage(explosion, x-width/2, y, null);
			TorpedoManager.remove(this); 
		}
		
		if(isCollidedWithMissile){
			canvas.drawImage(explosion, x-width/2, y, null);
			TorpedoManager.remove(this); 
		}
		
	}
	
}















