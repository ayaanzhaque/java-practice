package jrJava.sorting_bubble;

public class BinarySearch {

	public static void main(String args[]){
		
		int[] values = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");
		
		Utility.print(values);
		BubbleSorter.sort(values);
		Utility.print(values);
		
		int index = search(values, 995);
		System.out.println("index = " + index);
		
	}
	
	
	public static int search(int[] data, int searchKey){
		
		int low = 0, high = data.length-1;
		int mid;
		int count = 0; //delete this later
		
		while(low <= high){
			count ++;
			System.out.println(count);
			mid = (low + high)/2;
			if(searchKey > data[mid]) low = mid + 1;
			else if(searchKey < data[mid]) high = mid - 1;
			else return mid;
		}
		
		return -1;
	}
	
	
}
