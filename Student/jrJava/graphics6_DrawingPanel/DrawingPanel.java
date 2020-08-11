package jrJava.graphics6_DrawingPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel implements MouseListener{
	
	private JFrame frame;
	
	private int x = 200,y = 100, radius = 100;
	
	private Image[] images;
	private int ImageIndex;
	
	
	
	public DrawingPanel(){
		frame = new JFrame("My Project");
		frame.setBounds(300,100,800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(this);
		
		
		images = new Image[3];
		images[0] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg1.png").getImage();
		images[1] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg2.png").getImage();
		images[2] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg3.png").getImage();
		
		
		
		frame.setVisible(true);
		
		this.addMouseListener(this);
		
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
	
	public void mousePressed(MouseEvent e){
		int mx = e.getX();
		int my = e.getY();
		System.out.println(mx + "," + my);
		
		if(mx<100) x -= 5;
		else if(mx>500) x+=5;
		
		if(my<100) y -=5;
		else if(my>300) y+=5;
		
		this.repaint();
	}
	
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	

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
