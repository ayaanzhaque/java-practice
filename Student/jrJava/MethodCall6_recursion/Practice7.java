package jrJava.MethodCall6_recursion;

public class Practice7 {

	public static void main(String[] args) {
		
		System.out.println(sumRecursion(1,100));

	}
	
	public static int sum(int begin, int end){
		int i;
		int sum = 0;
		for(i = begin; i <= end;i++){
			sum += i;
		}
		return sum;
	}
	
	public static int sumRecursion(int begin, int end){
		if (begin == end) return begin;
		int mid = (begin+end)/2;
		return sum(begin,mid) + sum(mid+1,end);
	}

}
