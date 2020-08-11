package methodCall1;

public class Practice2 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = a + b;
		
		doSomething();
		
		System.out.println("C = " + c);
		
		doSomething();
		
		System.out.println("I am done");

	}
	
	
	private static void doSomething(){
		
		int a = 5;
		int b = 10;
		int c = a + b; 
		
		System.out.println("C = " + c);
		
		
	}

}
