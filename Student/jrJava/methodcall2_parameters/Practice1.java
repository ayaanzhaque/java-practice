package jrJava.methodcall2_parameters;

public class Practice1 {

	public static void main(String[] args) {
		int a = 5;
		boolean b = true;
		char c = 'c';
		
		methodA(a, b, c);
		System.out.println("It was a good trip");
		
		methodA(10, false, 'f');
		System.out.println("I am so happy");
	}
	
	public static void methodA(int pp, boolean aaa, char xyz){
		
		int f = 10;
		boolean g = true;
		
		pp = f*pp;
		aaa = aaa || g;
		
		System.out.println(pp + "," + aaa + ',' + xyz);
	}

}
