package jrJava.mutli_threading_5;

import java.awt.Color;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ColorReader implements Runnable{

	private Scanner scanner;
	private Color color;
	
	
	
	public ColorReader() {
		scanner = new Scanner(System.in);
		color = Color.blue;
		
	}
	
	public Color getColor() { return color; }
	
	public void read() {
		System.out.println("Enter r g b");
		String line = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(line, ",.;:");
		int red = Integer.parseInt(st.nextToken());
		int green = Integer.parseInt(st.nextToken());
		int blue = Integer.parseInt(st.nextToken());
		color = new Color(red,green,blue);
	
	}
	
	public void run() {
		while(true) {
			read();
		}
	}
	
}
