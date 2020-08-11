package jrJava.recursionSorting;

public class MergeSort {

	public static void main(String[] args){
		
		int[] a = {23,11,56,8,3,15,33,41,29,5,22,9};
		sort(a);
		for(int i = 0; i < a.length; i++) System.out.print( a[i]  + " ");
		
		
	}
	
	public static void sort(int[] data){
		sort(data, 0, data.length-1, new int[data.length]);
	}
	
	public static void sort(int[] data, int low, int high, int[] temp){
		
		if(low >= high) return; //cannot break into any smaller task
		
		int mid = (low + high)/2;
		sort(data, low, mid, temp);
		sort(data, mid+1, high, temp);
		
		
		
		for(int i=low; i <= high; i++) temp[i] = data[i];

		
		int i = low, j = mid+1, k = low;
		while(i<=mid && j<=high){
			if(temp[i] < temp[j]) data[k++] = temp[i++];
			else data[k++] = temp[j++];
		}
		
		while(i<=mid) data[k++] = temp[i++];
		
		
	}
	
}


