package jrJava.exceptionHandling;

import java.io.File;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		System.out.println("point 1");

		String msg = "Hello";
		int[] values = {1,2,3,4};
		String quantity = "413";

		doWork(msg, values, quantity);	

		System.out.println("point 4");

	}

	public static void doWork(String msg, int[] values, String quantity) {
		System.out.println("point 2");

		try {
			System.out.println("The length of message = " + msg.length());
			System.out.println("The value at index 4 is = " + values[3]);
			System.out.println("The number is" + Integer.parseInt(quantity));
		}	
		catch(RuntimeException rte) {}


		System.out.println("point 3");
	}


}
