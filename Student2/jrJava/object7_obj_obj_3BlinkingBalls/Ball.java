package jrJava.object7_obj_obj_3BlinkingBalls;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import jrJava.object7_obj_obj_3BlinkingBalls.Test;
import jrJava.object7_obj_obj_3BlinkingBalls.Wall;
import resources.SoundPlayer;

public class Ball {

	int x;
	int y;
	int xSpeed;
	int ySpeed;
	int radius;
	SoundPlayer sound;
	Image image;
	Wall wall;
	Ball otherBall1;
	Ball otherBall2;
	Color color;
	boolean collidedWithOtherBall1;
	boolean collidedWithOtherBall2;
	
	Ball(int _x, int _y, int _xSpeed, int _ySpeed, Wall _wall,int _radius, Color _color, String soundPathFile){
		x = _x;
		y=_y;
		xSpeed = _xSpeed;
		ySpeed = _xSpeed;
		
		radius = _radius;
		
		wall = _wall;
		
		color = _color;
		
		sound = new SoundPlayer(soundPathFile);
	}


	void move(){
		x = x + xSpeed;
		y = y + ySpeed;
		
		if(x<= wall.left + radius){
			x = wall.left + radius;
			xSpeed = -xSpeed;
			sound.play();
			
		}
		
		else if(x >= wall.right - radius){
			x = wall.right - radius;
			xSpeed = -xSpeed;
			sound.play();
		}
		
		if(y <= wall.top + radius){
			y = wall.top + radius;
			ySpeed = -ySpeed;
			sound.play();
		}
		
		else if(y >= wall.bottom - radius){
			y = wall.bottom - radius;
			ySpeed = -ySpeed;
			sound.play();
			
		}
		
		double distance1 = Math.sqrt((x - otherBall1.x)*(x-otherBall1.x) + (y - otherBall1.y)*(y - otherBall1.y));
		double distance2 = Math.sqrt((x - otherBall2.x)*(x-otherBall2.x) + (y - otherBall2.y)*(y - otherBall2.y));
		
		if(distance1 > radius + otherBall1.radius) collidedWithOtherBall1 = false;
		
		else collidedWithOtherBall1 = true;
		
		if(distance2 > radius + otherBall1.radius) collidedWithOtherBall2 = false;
		
		else collidedWithOtherBall2 = true;
	}
		

	void speedUp(){
		xSpeed *=2;
		ySpeed *=2;
	}

	int getSize(){
		return radius;
	}

	void grow(){
		radius ++;
	}

	void draw(Graphics canvas){
		if(collidedWithOtherBall1 || collidedWithOtherBall2){
			canvas.setColor(color);
			canvas.drawOval(x-radius, y-radius, 2*radius, 2*radius);
		}
		else{
			canvas.setColor(color);
			canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		}
}
}
