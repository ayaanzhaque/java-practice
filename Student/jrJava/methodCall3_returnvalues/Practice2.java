package jrJava.methodCall3_returnvalues;

public class Practice2 {

	public static void main(String[] args) {
		
		double resultA = mA(3,4); //
		
		double resultB = mB(3,4);
	}
	
	public static int mA(int a, int b) {
		return a+b;
	}
	
	public static double mB(int a , int b){
		return a+b;
	}
	
	public static int mC(double a, double b){
		return a+b;
	}

}
