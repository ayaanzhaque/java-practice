package jrJava.usingMouseListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box implements MouseListener{

	private int x,y;
	private int w,h;
	private Color color;
	
	public Box(int _x, int _y, int _w, int _h, Color _color){
		x = _x;
		y = _y;
		w = _w;
		h = _h;
		color = _color;
	}
	
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillRect(x-w/2, y-h/2, w, h);
	}



	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked");
	}



	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
	}



	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
	}



	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse entered");
	}



	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited");
	}


	
	
}





