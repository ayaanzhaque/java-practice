package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.util.Scanner;

public class MessageReceiver implements Runnable {

	private Scanner scanner;
	
	public MessageReceiver(InputStream is){
		scanner = new Scanner(is);
	}
	
	public void run(){
		receive();
	}
	
	public void receive(){
		String message;
		while(true){
			message = scanner.nextLine();
			System.out.println(message);
		}
	}
}
 