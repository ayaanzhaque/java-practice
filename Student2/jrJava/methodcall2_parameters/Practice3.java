package jrJava.methodcall2_parameters;

public class Practice3 {

	public static void main(String[] args) {


		//myMethod(1,2);
		//int sum1 = myMethod(1,2);
		
		//System.out.println(myMethod(3,4));

		//int sum2 = myMethod(5,6) + 3*myMethod(3,5);
		
		int sum3 = myMethod(myMethod(1,2), myMethod(3,4));
		
	}
	
	
	public static int myMethod(int a, int b){
		int c = a+b;
		return c;
	}

	/*public static int myMethod2(int a, int b){

		if(a < 0 && b < 0){
			System.out.println("Wrong inputs");
			return -1;
		}
		int c = a+b;
		System.out.println("sum = " + c);
		return c*c;
	}

	public static void myMethod1(int a, int b){

		if(a < 0 && b < 0){
			System.out.println("Wrong inputs");
			return;
		}
		int c = a+b;
		System.out.println("sum = " + c);
		return;
	}
*/

}
