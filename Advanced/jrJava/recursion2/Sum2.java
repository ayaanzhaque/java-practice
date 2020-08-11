package jrJava.recursion2;

public class Sum2 {

	public static void main(String[] args) {
		
		System.out.println(sum(1, 10));
		

	}
	
	public static int sum(int begin, int end){
		if(begin == end) return begin;
		int mid = (begin+end)/2;
		return sum(begin, mid) + sum(mid+1, end);
	}

}
