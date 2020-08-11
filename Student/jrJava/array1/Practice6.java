package jrJava.array1;

public class Practice6 {

	public static void main(String[] args) {
		
		int len = 10;
		
		int temp;
		
		int[] data = new int[len];
		
		for(int i = 0; i < len; i++){
			
			data[i] = (int) (Math.random()*100);
			System.out.print(data[i] + " ");
			
		}
		System.out.println();
		
		/*
		temp = data[0];
		for(int i = 1; i < len; i++){
			data[i-1] = data[i];
		}
		data[len-1] = temp;*/
		
		temp = data[0];
		for(int i = 0; i < len-1; i++){
			data[i] = data[i+1];
		}
		data[len-1] = temp;
		
		for(int i = 0; i < len; i++) System.out.print(data[i] + " ");
		System.out.println();

	}

}
