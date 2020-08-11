package jrJava.graphics7_MouseListener.copy;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel implements KeyListener, ActionListener{
	
	private JFrame frame;
	private JButton button;
	
	
	private int x = 200,y = 100, radius = 100;
	
	private Image[] images;
	private int ImageIndex;
	
	
	
	public DrawingPanel(){
		frame = new JFrame("My Project");
		frame.setBounds(300,100,800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(this);
		
		
		this.setLayout(null);
		
		button = new JButton();
		button.setBounds(480, 5, 100, 100);
		this.add(button);
		
		images = new Image[3];
		images[0] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg1.png").getImage();
		images[1] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg2.png").getImage();
		images[2] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg3.png").getImage();
		
		frame.setVisible(true);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {}
		
		this.requestFocus();
		
		this.addKeyListener(this);

		
	}
	
	public void changeImage(){
		ImageIndex++;
		if(ImageIndex==images.length) ImageIndex = 0;
	}
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.drawImage(images[ImageIndex], 0, 0, null);
		
		g.setColor(Color.orange);
		g.fillOval(x, y, 2*radius, 2*radius);
		
		
	}
	
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.k)
	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e) {}
	
	
	
	

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel();

		while(true){
			panel.changeImage();
			panel.repaint();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}


}
