package jrJava.array1;

public class Practice4 {

	public static void main(String[] args) {
		
		int len = 40;
		
		int temp;
		
		int[] data = new int[len];
		
		
		
		for(int i = 0; i < len; i++){
			
			data[i] = (int) (Math.random()*100);
			System.out.print(data[i] + " ");

		}
		
		System.out.println();
		
		for(int i = 0; i < len/2; i++){
		temp = data[i];
		data[i] = data[len-1-i];
		data[len-1-i] = temp;
	}
		
	for(int i = 0; i < len; i++) System.out.print(data[i] + " ");
	System.out.println();
		
		
		
	}

}
