package jrJava.bits_and_bytes;

public class Practice6 {

	public static void main(String[] args) {
		
		int a = 0b01101011;
		int b = a >> 1;

		printBinary(a);
		printBinary(b);
		
	}
	
	public static void printBinary(int value){
		String binaryString = Integer.toBinaryString(value);
		for(int i = 0; i < 32-binaryString.length(); i++){
			System.out.print('0');
		}
		
		System.out.println(binaryString);
	}

}
