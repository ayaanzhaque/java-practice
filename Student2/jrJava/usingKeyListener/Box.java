package jrJava.usingKeyListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Box implements KeyListener{

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


	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		//System.out.println(keyCode);
		
		if(keyCode==37) x -=3;
		else if(keyCode==38) x +=3;
		else if(keyCode==32){
			w*=2;
			h*=2;
		}
		
		//char key = e.getKeyChar();
		//System.out.println(key);
	}

	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
}





