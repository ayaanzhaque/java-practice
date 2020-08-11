package jrJava.multi_threading_4;

public class BankAccount {

	private double balance = 1000000;
	
	public double getBalance() { return balance; }
	
	public boolean withdraw(double request) {
		
		if(balance == 0 || request > balance) return false;
		
		//check HLS server
		//check ATF server
		//check DEA server
		//check against lien
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		balance -= request;
		return true;
		
	}
	
	
}
