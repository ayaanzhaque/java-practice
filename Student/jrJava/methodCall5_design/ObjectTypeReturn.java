package jrJava.methodCall5_design;

import java.util.Scanner;

public class ObjectTypeReturn {

	public static void main(String[] args) {
		
		System.out.println("type in a integer");
		//Scanner scanner = createScanner();
		//int typedNumber = scanner.nextInt();
		
		int typedNumber = createScanner().nextInt();
		
		System.out.println("you typed in " + typedNumber);
		
		}
	
	public static Scanner createScanner(){
		Scanner myScanner = new Scanner(System.in);
		return myScanner; 
		

	}

}
