package jrJava.sorting_insertion;

public class MinFinder {

	public static void main(String[] args) {
		
		int[] values = Utility.loadIntArrayFromFile("jrJava/sorting_selection/random.txt");
		//int smallest = min(values);
		
		int index = minIndex(values);
		System.out.println(index);
		//System.out.println(smallest);
		
	}
	
	public static int min(int[] data){
		int min = data[0];
		for(int i = 1; i < data.length; i++){
			if(data[i]<min) min = data[i];
		}
		return min;
	}
	
	public static int minIndex(int[] data){
		
		int minIndex = 0;
		for(int i = 0; i < data.length; i++){
			if(data[i]<data[minIndex]) minIndex = i;
		}
		return minIndex;
		
	}

}
