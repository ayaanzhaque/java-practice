package jrJava.loops4_while;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

int availableSeats = 150;
		
		Scanner scanner = new Scanner(System.in);
		int seatsRequested;
		
		do {
			System.out.println("Currently there are " + availableSeats + " How many seats would you like?");
			seatsRequested = scanner.nextInt();
			if(availableSeats >= seatsRequested){
				System.out.println("We have " + seatsRequested + " seats for your party");
				availableSeats -= seatsRequested;
			}
			else{
				System.out.println("Sorry, not enough seats. We only have " + availableSeats + " seats." );
				availableSeats = 0;
			}
			
		} while(availableSeats > 0);
		
		System.out.println("All seats are filled");

	}

}
