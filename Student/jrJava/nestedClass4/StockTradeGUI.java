package jrJava.nestedClass4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StockTradeGUI {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField textField;
	
	public StockTradeGUI(){
		
		frame = new JFrame();
		frame.setTitle("Stock Trade");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel);
		panel.setLayout(null); 
		
		button = new JButton("Buy Stock");
		button.setBounds(50, 50, 120, 20);
		panel.add(button);
		
		textField = new JTextField();
		textField.setBounds(50, 150, 250, 20);
		panel.add(textField);
		
		button.addActionListener(
			
			new ActionListener() {
				
				private int aaa = 100;
				
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==button){
						processBuyTransaction();
						textField.setText("Just purchased 1000 stocks of XYZ company.");
					}
				}
				
				private void processBuyTransaction() {
					
				}
			}
				
		);
		
		frame.setVisible(true); 
	}
	
	
	
	
	
	public static void main(String[] args) {
		new StockTradeGUI();
	}

}







