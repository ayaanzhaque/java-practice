package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageReciever implements Runnable{

	private PrintWriter pw;
	private Scanner scanner;
	
	public MessageReciever(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void recieve() {
		String message;
		while(true) {
			message = scanner.nextLine();
			
		}
	}
	
	public void run() {
		
	}
	
}
