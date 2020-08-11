package jrJava.bits_and_bytes;

public class Practice4 {

	public static void main(String[] args) {
		
		int a = 1234567890;
		int b = 4444444;
		int c = a | b;
		
		printBinary(a);
		printBinary(b);
		printBinary(c);


	}
	
	public static void printBinary(int value){
		String binaryString = Integer.toBinaryString(value);
		for(int i = 0; i < 32-binaryString.length(); i++){
			System.out.println('0');
		}
		System.out.println();
		System.out.println(binaryString);
	}

}
