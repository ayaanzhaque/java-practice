package jrJava.MethodCall6_recursion;

public class Practice5 {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(10aya));
		System.out.println(fibonacci_recursion(10));

	}
	
	public static long fibonacci(int n){
		long first = 1;
		long second = 1;
		long third = first + second;
		if (n==1 || n==2) return 1;
		for(int i =3; i <=n;i++){
			third = second + first;
			first = second;
			second = third;
		}
		return third;
	
		
		
	}
	
	public static long fibonacci_recursion(int n){
		if(n==2 || n==1) return 1;
		return fibonacci_recursion(n-2)+fibonacci_recursion(n-1);
		
	}
	
		
}


