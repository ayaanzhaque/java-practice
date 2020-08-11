package jrJava.graphics2_layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest_FlowLayout {
	
	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	
	
	
	
	public LayoutTest_FlowLayout(){
		
		frame = new JFrame("Layout Test");
		frame.setBounds(200,100,400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		frame.getContentPane().add(panel);
		
		buttons = new JButton[5];
		
		for(int i=0; i < buttons.length; i++){
			buttons [i] = new JButton("button " + i);
		}
		
		
		panel.setLayout(new FlowLayout());
		
		for(int i = 0; i < buttons.length; i++){
			panel.add(buttons[i]);
		}
		
		
		
		frame.setVisible(true);	
		
		
	}
	

	public static void main(String[] args) {
		
		new LayoutTest_FlowLayout();
		

	}

}
