package jrJava.methodCall4_overloading;

import java.awt.Graphics;

public class Practice1 {

	public static void main(String[] args) {

	Graphics canvas;	
	canvas.drawI
		

	}
	
	public static int mm(){
		return 100;
	}
	
	public static int mn(int a){
		return 100*a;
	}
	
	public static int mm(boolean a){
		if (a) return 100;
		else return -100;
		
	}
	
	public static int mm(int a, int b){
		if (b) return 100*a;
		else return -100*a;
	
	}
	
	public static int mm(boolean a, int b){
		if (a) return 100*b;
		else return -100*b;
	}

}
