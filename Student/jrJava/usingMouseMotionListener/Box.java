package jrJava.usingMouseMotionListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Box implements MouseMotionListener{

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



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	
	
}





