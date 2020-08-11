package jrJava.bits_and_bytes;

public class Practice5 {

	public static void main(String[] args) {
		
		int a = 15;
		int b = ~a;
		printBinary(a);
		printBinary(b);

	}
	
	public static void printBinary(int value){
		String binaryString = Integer.toBinaryString(value);
		for(int i = 0; i < 32-binaryString.length(); i++){
			System.out.println('0');
		}
		System.out.println(binaryString);
	}

}
