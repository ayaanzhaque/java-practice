package jrJava.multi_threading_3;

public class Calculator {

	int sum;
	
	public synchronized void calculateSum(){
	
		
		for(int i=1; i<=10; i++){
			sum += i;
			System.out.println("Sum=" + sum );
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
		
	}
	
	public synchronized void calculateSquareSum() {
		
	}
	 
	
}
