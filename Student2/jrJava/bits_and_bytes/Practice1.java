package jrJava.bits_and_bytes;

public class Practice1 {

	public static void main(String[] args) {

		printBinary(Integer.MAX_VALUE);
		System.out.println("...");
		printBinary(2);
		printBinary(1);
		printBinary(0);
		printBinary(-1);
		printBinary(-2);
		System.out.println("...");
		printBinary(Integer.MIN_VALUE);
		
		System.out.println();
		
		printBinary(Integer.MAX_VALUE + 1);


		
		
	}
	
	public static void printBinary(int value){
		String binaryString = Integer.toBinaryString(value);
		for(int i = 0; i < 32-binaryString.length(); i++){
			System.out.println("0");
		}
		System.out.println(binaryString);
	}
	

}
