package jrJava.graphics2_layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest_BorderLayout {
	
	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	
	
	
	
	public LayoutTest_BorderLayout(){
		
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
		
	
		
		panel.setLayout(new BorderLayout());
		
		panel.add(buttons[0], BorderLayout.NORTH);
		panel.add(buttons[1], BorderLayout.SOUTH);
		panel.add(buttons[2], BorderLayout.EAST);
		panel.add(buttons[3], BorderLayout.WEST);
		panel.add(buttons[4]);
		
		frame.pack();
		frame.setVisible(true);	
		
		
	}
	

	public static void main(String[] args) {
		
		new LayoutTest_BorderLayout();
		

	}

}
