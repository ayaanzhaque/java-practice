package jrJava.graphics5_twoThreads;


import javax.swing.*;

public class TwoThreads {

	private static JFrame frame;
	private static FancyPanel panel;
	private static JButton button;
	
	public TwoThreads(){
		frame = new JFrame("Two Threads");
		frame.setBounds(300,100,600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new FancyPanel();
		frame.getContentPane();
		
		button = new JButton("Hello");
		button.setBounds(250, 10, 100, 20);
		panel.add(button);
		
		frame.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
	
		 new TwoThreads();
		 
		 for(int i = 0; i < 100; i++){
			 panel.changePosition();
			 frame.repaint();
			 
			 
			 try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		 }
		

	}

}
