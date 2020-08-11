package jrJava.graphics1_basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outsider implements ActionListener {

	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand().equals("ShootBtn")){
			System.out.println("Outsider shooting");
		}
		
		else if(e.getActionCommand().equals("AbortBtn")){
			System.out.println("Outsider aborting");
		}
	
	}

	
	
	
	
}
