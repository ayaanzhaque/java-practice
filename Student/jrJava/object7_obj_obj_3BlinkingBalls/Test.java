package jrJava.object7_obj_obj_3BlinkingBalls;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Test {

	public static void main(String[] args) {
		
		Wall wall = new Wall();
		
		Ball ballA = new Ball(200,200,5,5,wall,100,Color.RED, "jrJava/object7_obj_obj_3BlinkingBalls/boing.wav");
		Ball ballB = new Ball(400,400,-4,-2,wall,100,Color.BLUE, "jrJava/object7_obj_obj_3BlinkingBalls/boing.wav");
		Ball ballC = new Ball(600,600,10,10,wall,100,Color.GREEN, "jrJava/object7_obj_obj_3BlinkingBalls/boing.wav");
		
		ballA.otherBall1 = ballB;
		ballA.otherBall2 = ballC;
		ballB.otherBall1 = ballA;
		ballB.otherBall2 = ballC;
		ballC.otherBall1 = ballA;
		ballC.otherBall2 = ballB;
		
		DrawingBoard board = new DrawingBoard(200,50,1000,800);
		Graphics canvas = board.getCanvas();
		
		while(true){
			ballA.move();
			ballB.move();
			ballC.move();
			
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
