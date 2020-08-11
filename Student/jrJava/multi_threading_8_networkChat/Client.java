package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import jrJava.multi_threading_7_twoWayNetworking.MessageReceiver;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost", 5454);
		
		GUI gui = new GUI("Client");

		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);
		
		System.out.println("Client Side:");
		
		new Thread(receiver).start(); 
		
	}

}
