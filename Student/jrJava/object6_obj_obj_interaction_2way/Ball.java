package jrJava.object6_obj_obj_interaction_2way;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

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
	Ball theOtherBall;
	boolean collidedWithOtherBall;
	
	Ball(int _x, int _y, int _xSpeed, int _ySpeed, String imageFilePath, Wall _wall){
		x = _x;
		y=_y;
		xSpeed = _xSpeed;
		ySpeed = _xSpeed;
		
		
		
		ImageIcon icon = new ImageIcon(imageFilePath);
		image = icon.getImage();
		radius = image.getWidth(null)/2;
		
		wall = _wall;
	}


	void move(){
		x = x + xSpeed;
		y = y + ySpeed;

		if(x<=wall.left+radius){
			x = wall.left+radius;
			xSpeed = -xSpeed;
		} 

		else if(x >= wall.right-radius){
			x = wall.right-radius;
			xSpeed = -xSpeed;
		}

		if(y <= wall.top+radius){
			y = wall.top+radius;
			ySpeed = -ySpeed;
		}
		else if(y >= wall.bottom-radius){
			y = wall.bottom-radius;
			ySpeed = -ySpeed;
		}
		
		double distance = Math.sqrt((x-theOtherBall.x)*(x-theOtherBall.x) + (y-theOtherBall.y)*(y-theOtherBall.y));
		if(distance>radius+theOtherBall.radius){
			collidedWithOtherBall = false;
		}
		else {
			collidedWithOtherBall = true;
		}
		
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
		if(collidedWithOtherBall){
			canvas.setColor(Color.BLACK);
			canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		}
		else{
			canvas.drawImage(image, x-radius, y-radius, null);
		}
		
	}
}
