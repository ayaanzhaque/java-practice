package jrJava.graphics5_twoThreads;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class FancyPanel extends JPanel{
	
	private int squareX = 10, squareY = 150;
	private int squareWidth = 100, squareHeight = 100;

	
	public void changePosition(){
		squareX += 3;
	}
	
	
	public void paintComponent(Graphics g){
		
		
			g.setColor(Color.white);
			g.fillRect(0, 0, getWidth(), getHeight());
		
			g.setColor(Color.red);
			g.drawRect(squareX, squareY, squareWidth, squareWidth);
		
		
	}
	
}
