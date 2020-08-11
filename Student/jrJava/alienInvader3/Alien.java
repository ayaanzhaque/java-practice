package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;

public class Alien {

	private int x, y; // center. bottom
	private int vx, vy;
	private static int width, height;
	private Color bodyColor, eyeColor;
	private static int eyeRadius;
	private boolean isCollided;
	private static Color explosionColor;
	private static int explosionRadius;
	private Ship target;
	
	
	static {
		width = 25;
		height = 25;
		eyeRadius = 3;
		explosionColor = Color.pink;
		explosionRadius = 120;
	}
	
	
	public Alien(int x, int y, int vx, int vy, Color bodyColor, Color eyeColor, Ship target){
		this.x = x;
		this.y  = y;
		this.vx = vx;
		this.vy = vy;
		this.bodyColor = bodyColor;
		this.eyeColor = eyeColor;
		this.target = target;
	}
	

	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return width; }
	public static int getHeight(){ return height; }
	
	
	public boolean isHit(Torpedo torpedo){
		
		if(torpedo.getX()>=x-width/2-Torpedo.getWidth()/2 &&
		   torpedo.getX()<=x+width/2+Torpedo.getWidth()/2 &&
		   torpedo.getY()>=y-height-Torpedo.getHeight()   &&
		   torpedo.getY()<=y){
			
			AlienManager.remove(this); 
			return true;
		}
		
		return false;
	}
	
	
	
	public void move(){
		x += vx;
		y += vy;
		
		if(y>720) AlienManager.remove(this); 
		
		if(x<0+width/2 || x>800-width/2) vx *= -1;
		
		if(Math.random()<0.1 && MissileManager.seatAvailable()) MissileManager.add( new Missile(x, y + Missile.getHeight(), 2*vy, target) );
		
		isCollided = target.isHit(this);
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(bodyColor);
		canvas.drawRect(x-width/2, y-height, width, height);
		
		canvas.setColor(eyeColor);
		canvas.fillOval(x-width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
		canvas.fillOval(x+width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
	
		if(isCollided){
			canvas.setColor(explosionColor);
			canvas.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.gameOn = false;
		}
	
	}
	
	
}
















