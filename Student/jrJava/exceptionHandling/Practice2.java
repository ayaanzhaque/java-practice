package jrJava.exceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		int duration = 100;
		String path = "jrJava/exceptionHandling/diary,txt";
		doWork(duration, path);

	}
	
	public static void doWork(int duration, String path) {
		try {
			Thread.sleep(duration);
			Scanner scanner = new Scanner(new File(path));
		}
		catch(InterruptedException ie) {}
		
		catch(IOException ioe) {}
	}
	

}
