package jrJava.sorting_selection;

import jrJava.sorting_bubble.Utility;

public class SelectionSorter {

	public static void main(String[] args) {

		int[] data = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");		

		Utility.print(data);

		sort(data);
		Utility.print(data);
	}
	
	//Performance:
	//1. [17,11,8,6,5,2] 15 times 5+4+3+2+1
	//2. [2,5,6,8,11,17] 15 times 5+4+3+2+1
	// there is no best or worse case scenario



	public static void sort(int[] data){
		//we shrink window, [0, len -1] --> [len-2, len-1]
		//in each window, we locate the index of the min value
		//we move the value to the front
		
		int i, j, minIndex, temp;
		
		for(i = 0; i < data.length-1;i++){
			minIndex = i;
			for(j=i+1; j < data.length; j++){
				if(data[j]<data[minIndex]) minIndex = j;
			}
			
			temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
			
		}
	
	
	

	}

}
