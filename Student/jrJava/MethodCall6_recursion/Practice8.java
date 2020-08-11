package jrJava.MethodCall6_recursion;

public class Practice8 {

	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(3142));
	}
	
	public static int sumOfDigits(int number){
		if (number < 10) return number;
		 return number%10  + sumOfDigits(number/10);
	}

}
