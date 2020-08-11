package jrJava.object6_obj_obj_interaction_2way;

import java.awt.Graphics;

import resources.DrawingBoard;

public class Test {

	public static void main(String[] args) {
		
		Wall wall= new Wall();
		
		Ball ballA = new Ball(200,270,6,-4,"jrJava/object6_obj_obj_interaction_2way/yellowBall.png", wall); 
		Ball ballB = new Ball(290,430,4,1, "jrJava/object6_obj_obj_interaction_2way/greenBall.png", wall);
		
		ballB.theOtherBall = ballA;
		ballA.theOtherBall = ballB;
		
		
		DrawingBoard board = new DrawingBoard(200,50,800,600);
		Graphics canvas = board.getCanvas();
		
		board.setBackgroundImage("jrJava/object6_obj_obj_interaction_2way/bg3.png");
		
		
		while(true){
			ballA.move();
			ballB.move();
			wall.change();
			ballA.draw(canvas);
			ballB.draw(canvas);
			wall.draw(canvas);
			board.repaint();
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {}
			
		}
	}
		
		
	}


