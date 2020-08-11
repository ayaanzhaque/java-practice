package jrJava.sorting_more;

import jrJava.sorting_bubble.Utility;

public class DescendingOrderSorter {

	public static void main(String[] args) {

		int[] data = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");		

		Utility.print(data);

		selectionSort(data);

		Utility.print(data);



	}

	public static void bubbleSort(int[] values){

		boolean sorted =  false;
		int i, temp;


		while(!sorted){


			//check two consecutive values, if they are out of order, flip them.
			//before each scan, assume it is sorted, and if it is not, then set it as not sorted


			sorted = true;

			for(i = 0; i < values.length-1; i++){
				if(values[i]<values[i+1]){
					//if here, they are in wrong order
					//assumtion was wrong and they need to be flipped
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false;
				}
			}

			//if the "sorted" holds the value false, it means the swapping has to happen;




		}

		public static void selectionSort(int[] data){


			int i, j, maxIndex, temp;

			for(i = 0; i < data.length-1;i++){
				maxIndex = i;
				for(j=i+1; j < data.length; j++){
					if(data[j]>data[maxIndex]) maxIndex = j;
				}

				temp = data[i];
				data[i] = data[maxIndex];
				data[maxIndex] = temp;

			}

		}

		public static void insertionSort(int[] data){

			int temp;
			int i, j;

			for(i=1; i < data.length; i++){
				temp = data[data.length-1];
				for(j = (data.length-1)-1; j >=0; j--){
					if(data[j]<temp) data[j+1] = data[j];
					else break;
				}
				data[j+1] = temp; 
			}


		}
	}

