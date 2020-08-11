package jrJava.recursion2;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibo(6));

	}

	public static int fibo(int n){
		if(n == 1 || n == 2) return 1;
		return fibo(n-2) + fibo(n-1);	
	}

	public static int fiboWORecusrion(int n){
		int first = 1;
		int second = 1;

		if(n==1) return first;
		if(n==2) return second;

		int third = 0;

		for(int i = 3; i <= n; i++){
			third = first + second;
			first = second;
			second = third;
		}

		return third;

	}


}
