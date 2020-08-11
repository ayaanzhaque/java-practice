package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws Exception{

		 ServerSocket ss = new ServerSocket(5454);
		 Socket s = ss.accept();
		 
		 InputStream is = s.getInputStream();
		 OutputStream os = s.getOutputStream();
	
		 
		 MessageSender sender = new MessageSender(os);
		 MessageReciever receiver = new MessageReciever(is);
		 
		 sender.send();
		 receiver.recieve();
		
	}

}
