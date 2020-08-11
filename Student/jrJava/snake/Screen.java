package jrJava.snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;



public class Screen extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH =  800, HEIGHT = 800;
	private Thread thread;
	private boolean running = false;
	
	private BodyPart b;
	private ArrayList<BodyPart> snake;
	
	private Apple apple;
	private ArrayList<Apple> apples;
	
	private Random r;
	
	private int xCoor = 10, yCoor = 10;
	private int size = 5;
	
	private boolean right = true, left = false, up = false, down = false;
	
	private int ticks=0;
	
	private Key key;
	
	public Screen(){
		setFocusable(true);
		key = new Key();
		addKeyListener(key);
		setPreferredSize(new Dimension(WIDTH, HEIGHT ));
		
		r = new Random();
		
		snake = new ArrayList<BodyPart>();
		apples = new ArrayList<Apple>();

		
		start();
	}
	 	
	public void tick(){
		if(snake.size() == 0){
			b = new BodyPart(xCoor, yCoor, 10);
			snake.add(b);
		}
		
		if(apples.size() == 0){
			int xCoor = r.nextInt(79);
			int yCoor = r.nextInt(79);
			apple = new Apple(xCoor, yCoor, 10);
			apples.add(apple);
			
		}
		
		for(int i=0; i<apples.size(); i++){
			if(xCoor == apples.get(i).getxCoor() && yCoor == apples.get(i).getyCoor()){
				size++;
				apples.remove(i);
				i--;
			}
		}
			
		for(int i=0; i<snake.size(); i++){
			if(xCoor == snake.get(i).getxCoor() && yCoor == snake.get(i).getyCoor()){
				if(i != snake.size() - 1){
					stop();
				}
			}
		}
			
			
		if(xCoor <0 || xCoor > 79 || yCoor >79) stop();
			
		ticks++;
		if(ticks> 220000){
			if(right) xCoor++;
			if(left) xCoor--;
			if(up) yCoor--;
			if(down) yCoor++;
			
			
			ticks = 0;
			
			b = new BodyPart(xCoor, yCoor, 10);
			snake.add(b);
			
			if(snake.size() > size){
				snake.remove(0);
			}
		}
		
	}
	
	public void paint(Graphics g){
		
		g.clearRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.black);
		for(int i=0;i<WIDTH/10;i++ ){
		g.drawLine(i*10, 0, i*10, HEIGHT);
		}
		
		for(int i=0; i<HEIGHT/10; i++){
			g.drawLine(0, i*10, HEIGHT,i*10);
		}
		
		for(int i =0; i<snake.size(); i++){
			snake.get(i).draw(g);
		}
		for(int i=0; i<apples.size(); i++){
			apples.get(i).draw(g);
		}
		
		
	}
	
	public void start(){
		running = true;
		thread = new Thread(this, "Game Loop");
		thread.start();
	}
	
	public void stop(){
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {}
		
	}
	
	public void run(){
		while(running){
			tick();
			repaint();
		}
	}
	
	private class Key implements KeyListener{
		public void keyTyped(KeyEvent e) {}
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			
			if(key == KeyEvent.VK_RIGHT && !left){
				up = false;
				down = false;
				right = true;
			}
			if(key == KeyEvent.VK_LEFT && !right){
				up = false;
				down = false;
				left = true;
			}
			if(key == KeyEvent.VK_UP && !down){
				left = false;
				right = false;
				up = true;
			}
			if(key == KeyEvent.VK_DOWN && !up){
				right = false;
				left = false;
				down = true;
			}
		}
		public void keyReleased(KeyEvent e) {}
		
		
		
		
		
	}
	
}
