package jrJava.multi_threading_6_network;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) throws Exception{
	
		Socket s = new Socket("192.168.1.65", 5454);
		
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		
		pw.println("Sir has Ligma");
		pw.flush();
		pw.close();
		s.close();
	}
	
}
