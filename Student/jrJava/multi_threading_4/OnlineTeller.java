package jrJava.multi_threading_4;

public class OnlineTeller implements Runnable{

	private BankAccount account;
	
	public void setBankAccount(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		
	}
	
	public void withdrawAll() {
		double amount = account.getBalance();
		boolean result = account.withdraw(amount);
		
		if(result) {
			System.out.println("$" + amount + "was successfully transfered to your off-shore account");
		}
		else {
			System.out.println("It was delclined");
		}
	}
	
}

