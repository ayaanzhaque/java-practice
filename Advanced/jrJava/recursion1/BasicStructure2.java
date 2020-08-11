package jrJava.recursion1;

public class BasicStructure2 {

	public static void main(String[] args) {

		m(0);
		
	}
	
	public static void m(int a){
		a++;
		System.out.println(a);
		if(a >= 100) return;
		m(a);
	}

}
