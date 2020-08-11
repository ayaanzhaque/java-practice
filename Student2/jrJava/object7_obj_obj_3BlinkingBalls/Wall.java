package jrJava.object7_obj_obj_3BlinkingBalls;

import java.awt.Color;
import java.awt.Graphics;

public class Wall {

	int left = 50;
	int top = 50;
	int right = 950;
	int bottom = 750;
	Color color = Color.black;
	int changeRate = 1;

	Wall(){}

	void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(left,top,right-left,bottom-top);
	}

	void change(){
		left -= changeRate;
		right += changeRate;
		top -= changeRate;
		bottom += changeRate;

		if(bottom-top>550 || bottom-top < 200){
			changeRate = -changeRate;
		}
	}
}
