package jrJava.methodcall2_parameters;

public class Practice2 {

	public static void main(String[] args) {
		char f = 21;
		double g = 3.1415;
		boolean h = false;
		
		doSomething(f,g,h);
		
		doSomething(6, 2.3,true);
		
		int a = 5;
		double b = 1.1;
		boolean c = true;
		

	}
	
	public static void doSomething(int a, double b, boolean c){
		//will do something
		System.out.println(a + "," + b + "," + c);
		
		
	}

}
