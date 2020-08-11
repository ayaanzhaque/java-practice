package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {

	private JFrame frame;
	
	private int x=100, y=100;
	
	public MyJPanel(int x, int y, int width, int height){
		
		frame = new JFrame("My JPanel");
		frame.setBounds(x, y, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		this.setPreferredSize(new Dimension(width, height));
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void move(){
		x += 3;
		y += 5;
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.RED);
		g.fillRect(x, y, 100, 100);
	}
	
}  




