package jrJava.multi_threading_1;

public class Task {

	public static void main(String[] args){
		
			SquareSumTask sst = new SquareSumTask();
			
			Thread t2 = new Thread(sst);
			
			t2.start();
			
			int sum = 0;
			
			for(int i = 1; i <= 10; i++) {
				sum+=i;
				System.out.println("in squaresumtask: sum =" + sum);
			}
		
	}
	
}
