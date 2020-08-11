package jrJava.object6_obj_obj_interaction_2way_with_modifers;

import java.awt.Color;
import java.awt.Graphics;


public class Wall {

	private int left = 100;
	private int right = 700;
	private int top = 100;
	private int bottom = 500;
	private Color color = Color.gray;
	private int changeRate = 1;
	
	
	public Wall(){ }
	
	
	public int getLeft(){ return left+20; }
	public int getRight(){ return right-20; }
	public int getTop(){ return top+20; }
	public int getBottom(){ return bottom-20; }
	
	
	
	public void change(){
		left -= changeRate;
		right += changeRate;
		top -= changeRate;
		bottom += changeRate;
		
		if(bottom-top>=550 || bottom-top<=220){
			changeRate = -changeRate;
		}
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(left, top, right-left, bottom-top);
	}
	
}
 






