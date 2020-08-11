package jrJava.graphics2_layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest_MixedLayout {
	
	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	
	
	
	
	public LayoutTest_MixedLayout(){
		
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
		
		JPanel sPanel = new JPanel();
		sPanel.setLayout(new GridLayout(3,2));
		sPanel.add(buttons[4]);
		sPanel.add(buttons[5]);
		sPanel.add(buttons[6]);
		sPanel.add(buttons[7]);
		sPanel.add(buttons[8]);
		sPanel.add(buttons[9]);
		
		panel.add(sPanel);
		
		frame.setVisible(true);	
		
		
	}
	

	public static void main(String[] args) {
		
		new LayoutTest_MixedLayout();
		

	}

}
