package jrJava.sorting_bubble;

public class BubbleSorter {



	public static void main(String[] args) {

		//int[] data = {45, 27, 25, 11, 5, 64, 77, 55, 88, 29, 91, 9};
		//int [] data1 = Utility.createIntArray(40);
int[] data = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");		
		
		Utility.print(data);
		
		sort(data);
		
		Utility.print(data);
	}
	

	//Performance;
	// 1. {2,5,6,8,11,17} already sorted --> But, will still have to scan once 
	// 2. {2,5,8,6,11,17} --> will have to scan twice (one for ordering, one for confirmation)
	// 3. {17, 2, 5, 6, 8, 11} --> will have to scan twice (one for ordering, one for confirmation)
	// 4. {5,6,7,11,17,2} --> 6
	// 5. {17,11,8,6,5,2} --> 6
	// 6. if the length is 10, how many comparisons needed? --> (w.c.s) 10*10
	// 7. if the length is 100, how many comparisons needed? --> (w.c.s) 100*100
	// 8. if the lenght is n --> n*n
	
	public static void sort(int[] values){

		boolean sorted =  false;
		int i, temp;
		
		
		while(!sorted){
			
			
			//check two consecutive values, if they are out of order, flip them.
			//before each scan, assume it is sorted, and if it is not, then set it as not sorted
			
			
			sorted = true;
			
			for(i = 0; i < values.length-1; i++){
				if(values[i]>values[i+1]){
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false;
				}
			}

			//if the "sorted" holds the value false, it means the swapping has to happen;
			

			
			
		}



	}

}
