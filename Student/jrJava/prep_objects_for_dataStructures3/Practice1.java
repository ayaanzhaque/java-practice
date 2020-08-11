package jrJava.prep_objects_for_dataStructures3;

public class Practice1 {

	public static void main(String[] args){
		
		int [] num = {11,25,125,111,289};
		for(int i = 0; i <num.length; i++) System.out.println(num[i]);
		
		
		
		for(int i = 0; i <num.length-1; i++){
			if(num[i]>num[i+1]){
				int temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
			}
			
			
		}
		
		String s1 = "Hello";
		String s2 = "Hi There, I feel good today";
		
		
		
		
	}
	
}
