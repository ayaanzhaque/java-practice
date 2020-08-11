package jrJava.object5_obj_obj_interaction;

import java.awt.Graphics;

import resources.DrawingBoard;

public class Test {

	public static void main(String[] args) {
		
		Wall wall= new Wall();
		
		Ball ballA = new Ball(200,270,6,-4,"jrJava/object5_obj_obj_interaction/yellowBall.png", "jrJava/object5_obj_obj_interaction/boing.wav", wall); 
		Ball ballB = new Ball(290,430,4,1, "jrJava/object5_obj_obj_interaction/greenBall.png", "jrJava/object5_obj_obj_interaction/buzz.wav", wall);
		Ball ballC = new Ball(600,380,-6,-2,"jrJava/object5_obj_obj_interaction/redBall.png", "jrJava/object5_obj_obj_interaction/scream.wav", wall);

		DrawingBoard board = new DrawingBoard(200,50,800,600);
		Graphics canvas = board.getCanvas();
		
		
		while(true){
			ballA.move();
			ballB.move();
			ballC.move();
			wall.change();
			board.clear();
			ballA.draw(canvas);
			ballB.draw(canvas);
			ballC.draw(canvas);
			wall.draw(canvas);
			board.repaint();
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {}
			
		}
	}
		
		
	}


