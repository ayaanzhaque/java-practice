package jrJava.object6_obj_obj_interaction_2way;

import java.awt.Color;
import java.awt.Graphics;

public class Wall {

		int left = 100;
		int top = 100;
		int right = 700;
		int bottom = 500;
		Color color = Color.gray;
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
