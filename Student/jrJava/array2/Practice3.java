package jrJava.array2;

public class Practice3 {

	public static void main(String[] args) {
	
		int[] aaa = {4, 7, 12, 5, 99, 87, 45, 62};
		
		print(aaa);
		System.out.println(sum(aaa));
		doubleAllElements(aaa);
		print(aaa);

	}
	
	public static void print(int[] data){
		
		for(int i = 0; i < data.length; i++){
			
			System.out.print(data[i] + " ");
			
		}
		
		System.out.println();
		
		
	}
	
	public static int sum(int[] values){
		
		int sum = 0;
		
		for(int i = 0; i < values.length; i++){
			sum += values[i];
		}
		
		return sum;
		
	}
	
	public static void doubleAllElements(int[] data){
		
		for(int i = 0; i < data.length; i++) data[i] *= 2;
	}

}
