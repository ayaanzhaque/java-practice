package jrJava.array1;

public class Practice1 {

	public static void main(String[] args) {
		
		int[] values = new int[5];
		
		values[0] = 5;
		values[1] = -10;
		values[2] = values[0]+values[1];
		values[3] = values[2]*2;
		values[4] = values[0] + values[1] + values[2] + values[3];
		//values[5] = 1000;
		
		for(int i = 0; i < 5; i++){
			System.out.println(values[i]);
			
		}
		
		//--------------------------------------------
		
		
		double[] data1 = new double[5];
		boolean[] data2 = new boolean[2];
		int[] data3 = new int[1];
		int[] data4 = new int[0];
		
		data3[0] = 45;
		
		data2[0] = true;
		data2[1] = true;
		
		data1[0] = 1.3;
		data1[1] = data1[0]*2;
		data1[2] = data1[1]*2;
		data1[3] = data1[2]*2;
		data1[4] = data1[3]*2;
	}
}
