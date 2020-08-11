package jrJava.methodCall5_design;

public class Practice3 {

	public static void main(String[] args) {
	
		System.out.println(sum(100));
		
		

	}
	// 1+2+3....+(end)
	public static int sum(int end){
		return sum(1,end, 1);
	}
	// (begin) + (begin+1) + (begin+3)...+end
	public static int sum(int begin, int end){
		return sum(begin,end,1);
	}
	// (begin)+(begin+increment) + (begin + 2*increment)+...(end)
	public static int sum(int begin, int end, int increment){
		int sum = 0;
		for (int i=begin; i <=end; i+=increment){
			sum += i;
		}
		return sum;
	}

}
