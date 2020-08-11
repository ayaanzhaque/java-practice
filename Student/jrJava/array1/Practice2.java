package jrJava.array1;

public class Practice2 {

	public static void main(String[] args) {
		
		int len = 10;
		double avg = 0;
		int min = 101;
		int max = 0;
		int[] data = new int[len];
		double sum = 0.0;
		for(int i = 0; i < len;i++){
			data[i] = (int)(Math.random()*100);
			System.out.print(data[i] + " ");
			if(data[i] < min) min = data[i];
			if(data[i] > max) max = data[i];
			sum += data[i];
		}
		
		avg = sum/len;
		System.out.println();
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
		
		

	}

}
