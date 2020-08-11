package jrJava.graphics8_KeyListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class DrawingPanel extends JPanel implements KeyListener {

	private JFrame frame;
	private JButton button;
	private int x = 200, y = 100, radius = 100;
	
	private Image[] images;
	private int imageIndex;
	
	
	public DrawingPanel(){
		
		frame = new JFrame();
		frame.setBounds(300, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);
		
		//button = new JButton();
		//button.setBounds(480, 10, 100, 100);
		//this.add(button);
		
		images = new Image[3];
		images[0] = new ImageIcon("jrJava/graphics7_DrawingPanel_mouseListener/bg1.png").getImage();
		images[1] = new ImageIcon("jrJava/graphics7_DrawingPanel_mouseListener/bg2.png").getImage();
		images[2] = new ImageIcon("jrJava/graphics7_DrawingPanel_mouseListener/bg3.png").getImage();
		
		frame.setVisible(true);
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) { }
		
		this.requestFocus();
		
		this.addKeyListener(this);
	}
	
	
	public void changeImage(){
		imageIndex++;
		if(imageIndex==images.length) imageIndex = 0;
	}
	
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.white);
		g.fillRect(0,  0, getWidth(), getHeight());
		
		g.drawImage(images[imageIndex], 0, 0, getWidth(), getHeight(), null);
		
		g.setColor(Color.red);
		g.fillOval(x, y, 2*radius, 2*radius);
	}
	
	
	
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_LEFT) x -= 5;
		else if(keyCode==KeyEvent.VK_RIGHT) x += 5;
		else if(keyCode==KeyEvent.VK_UP) y -= 5;
		else if(keyCode==KeyEvent.VK_DOWN) y += 5;
		
		this.repaint();
	}
	
	
	public void keyReleased(KeyEvent e){ }
	public void keyTyped(KeyEvent e){ }
	
	
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel();
		
		while(true){
			panel.changeImage();
			panel.repaint();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { }
		}
		
	}

}
