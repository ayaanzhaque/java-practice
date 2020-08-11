package jrJava.barbarianAttack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

public class Arrow {

	private static Image eImage;
	private static int eWidth, eHeight;
	private static double gravity;
	private double x, y, vx, vy, length;
	private boolean collided;
	
	static {
		// load the explosion image
	}
	
	public Arrow(double x, double y, double vx, double vy, double length){
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.length = length;
	}
	
	public void move(/* we will use a parameter */) {
		x += vx;	
		y += vy;
	}
	
	
	
	public void draw(Graphics2D g) {
		g.setColor(Color.black);
		double hyp = Math.sqrt(vx*vx + vy*vy);
		g.drawLine((int) x, (int) y, (int) (x-length*vx/hyp), (int) (y-length*vy/hyp));
	}
}
