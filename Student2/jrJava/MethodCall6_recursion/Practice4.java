package jrJava.MethodCall6_recursion;

public class Practice4 {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}
	
	public static int factorial(int n){
		if(n==1) return 1;
		return factorial(n-1)*n;
			
	
	}
	
	public static int factorial_wo_recursion(int n){
		int i;
		int product = 0;
		for(i = 0; i <= n; i++){
			product *= n;
		}
		return product;
	}
}
