package jrJava.multi_threading_8_networkChat;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageSender {

	private PrintWriter pw;
	private Scanner scanner;
	
	public MessageSender(OutputStream os){
		pw = new PrintWriter(os);
	}
	
	public void send(String msg){
		pw.println(msg);
		pw.flush();
	}
	
	
}



