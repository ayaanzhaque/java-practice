package jrJava.methodCall5_design;

public class Pracitce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(1,100,1));
		
		System.out.println(sum(123,1234,1));
		
		System.out.println(sum(55,555,5));
		
		int result = sum(103,1000, 3);
		System.out.println(result);
	}
	
	public static int sum(int begin, int end, int increment){
		
		int sum =0;
		for(int i = begin; i < end; i+=increment){
			sum += 1;
		}
		return sum;
	}

}
