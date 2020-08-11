package jrJava.TicTacToe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public class TicTacToe extends JFrame{

	
	private JFrame frame;
	
	public TicTacToe(){
		
		frame = new JFrame();
		frame.setTitle("Tic Tac Toe");
		frame.setBounds(250, 200, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		frame.setVisible(true);
		
		
		
	}
	
	public void paintComponent(Graphics g){
		
		g.setColor(Color.orange);
		g.fillOval(300, 300, 2*100, 2*100);
		
		g.repaint();
	
	}
	
	public static void main(String[] args) {
		
		new TicTacToe();

	}

}
