package jrJava.array1;

public class Practice5 {

	public static void main(String[] args) {
		
		int len = 5
				;
		
		int temp;
		
		int[] data = new int[len];
		
		for(int i = 0; i < len; i++){
			
			data[i] = (int) (Math.random()*100);
			System.out.print(data[i] + " ");

		}
		System.out.println();
		
		/*temp = data[len-1];
		for(int i = len-2; i >= 0;i--){
			data[i+1] = data[i];
		}
		data[0] = temp;*/
		
		temp = data[len-1];
		for(int i = len-1; i > 0;i--){
			data[i] = data[i-1];
		}
		
		
		for(int i = 0; i < len; i++) System.out.print(data[i] + " ");

	}

}
