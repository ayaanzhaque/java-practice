package jrJava.sorting_insertion;

public class InsertionAlgorithm {

	public static void main(String[] args) {

		int[] values = {2,5,6,11,17,8};
		Utility.print(values);
		insert(values);
		Utility.print(values);


	}

	private static void insert(int[] data){

		int temp;
		int i, j;

		for(i=1; i < data.length; i++){
			temp = data[data.length-1];
			for(j = (data.length-1)-1; j >=0; j--){
				if(data[j]>temp) data[j+1] = data[j];
				else break;
			}
			data[j+1] = temp; 
		}
	}

}
