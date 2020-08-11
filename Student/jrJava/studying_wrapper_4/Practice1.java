package jrJava.studying_wrapper_4;

public class Practice1 {

	public static void main(String[] args) {
		
		Integer a1 = 123; //autoboxing
		int a2 = a1 + 111;//autounboxing
		Integer a3 = a1+111;//autounboxing, autoboxing
		
		//example 1
		doSomething(123);
		
		//example 2
		Double d1 = 3.14;
		doSomething2(d1);
		
		int a6 = doSomething3();
		
		Double d2 = doSomething4();
		
	}
	
	public static void doSomething(Integer a){
		System.out.println(a + 111);
	}
	
	public static void doSomething2(double b){
		Double d = b;
	}
	
	public static Integer doSomething3(){
		int a = 123;
		return a;
	}
	
	public static double doSomething4(){
		Double d2 = 3.14;
		return d;
	}
	

}
