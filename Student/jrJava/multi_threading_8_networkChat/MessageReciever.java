package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageReciever implements Runnable{

	private PrintWriter pw;
	private Scanner scanner;
	private GUI gui;
	
	public MessageReciever(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void setGUI(GUI gui) { this.gui = gui;}
	
	public void recieve() {
		String message;
		while(true) {
			message = scanner.nextLine();
			gui.addMessage(message);
			
		}
	}
	
	public void run() {
		recieve();
	}
	
	
}
