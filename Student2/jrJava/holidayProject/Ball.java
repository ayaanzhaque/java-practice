package jrJava.holidayProject;

import java.awt.Color;

public class Ball {


	private int x, y; // center coordinates
	private int xSpeed, ySpeed;
	private int radius;
	private Color color;
	private Deflector deflector;
	

	public Ball(int _x, int _y, int _xSpeed, int _ySpeed, int _radius, Color _color){
		x = _x;
		y = _y;
		xSpeed = _xSpeed;
		ySpeed = _ySpeed;
		radius = _radius;
		color = _color;
	}
	
	public void setDeflector(Deflector _deflector){
		deflector = _deflector;
	}
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getXSpeed(){ return xSpeed; }
	public int getYSpeed(){ return ySpeed; }
	public int getRadius(){ return radius; }

	public void setX(int _x){ x = _x; }
	public void setY(int _y){ y = _y; }
	public void setXSpeed(int _xSpeed){ xSpeed = _xSpeed; }
	public void setYSpeed(int _ySpeed){ ySpeed = _ySpeed; }
	
	public void move(){
		
		x += xSpeed;
		y += ySpeed;
		
		
		
	}


	
}
