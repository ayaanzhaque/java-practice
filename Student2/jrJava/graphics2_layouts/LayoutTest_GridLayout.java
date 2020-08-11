package jrJava.graphics2_layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest_GridLayout {
	
	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	
	
	
	
	public LayoutTest_GridLayout(){
		
		frame = new JFrame("Layout Test");
		frame.setBounds(200,100,400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		frame.getContentPane().add(panel);
		
		buttons = new JButton[10];
		
		for(int i=0; i < 10; i++){
			buttons [i] = new JButton("button " + i);
		}
		
	
		
		panel.setLayout(new GridLayout(3,4));
		
		panel.add(buttons[0], BorderLayout.NORTH);
		panel.add(buttons[1], BorderLayout.SOUTH);
		panel.add(buttons[2], BorderLayout.EAST);
		panel.add(buttons[3], BorderLayout.WEST);
		panel.add(buttons[4]);
		
		
		frame.setVisible(true);	
		
		
	}
	

	public static void main(String[] args) {
		
		new LayoutTest_GridLayout();
		

	}

}
