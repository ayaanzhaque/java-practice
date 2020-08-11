package methodCall1;

public class Practice3 {

	public static void main(String[] args) {

		int a = 12;
		int b = 5;
		int c = a+b;
		mA();
		System.out.println(c);
		
		
	}
	
	
	public static void mA(){
		int f = 12;
		int g = 5;
		int h = f+g;
		mB();
	}
	
	
	public static void mB(){	
		int p = 12;
		int q = 5;
		int r = p+q;
		
		
	}

}
