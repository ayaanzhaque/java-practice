package jrJava.recursion3;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5, 8, 9, 10, 16, 18, 20};

		System.out.println(search(a, 10, 0, a.length-1));

	}

	public static int search(int[] data, int key, int low, int high){
		
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(key < data[mid]) return search(data, key, low, mid-1);
		else if(key > data[mid]) return search(data, key, mid+1, high);
		else  return mid;
		
	}
	
	public static int searchWORecursion(int[] data, int key){

		int low = 0; 
		int high = data.length-1;
		int mid;

		

		while(low <= high){
			mid = (low+high)/2;
			if(key < data[mid]) high = mid-1;
			else if(key > data[mid]) low = mid + 1;
			else return mid;	
		}
		
		return -1;

	}
	

	//public static int search(int[] data, int key){



	//}

}
