package jrJava.loops4_while;

public class Practice2 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int i = 1;
		
		while(i <= 100){
			if(sum > 5000) break;
			sum += i*i;
			
			i++;
			
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
