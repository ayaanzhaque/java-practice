package jrJava.multi_threading_6_network;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {

	public static void main(String[] args) throws Exception{

		 ServerSocket ss = new ServerSocket(5454);
		 Socket s = ss.accept();
		 
		 InputStream is = s.getInputStream();
		 Scanner scanner = new Scanner(is);
		 String line = scanner.nextLine();
		 System.out.println("Server:" + line);
	}

}
