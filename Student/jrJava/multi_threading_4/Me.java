package jrJava.multi_threading_4;

public class Me {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		OnlineTeller teller = new OnlineTeller();
		teller.setBankAccount(account);
		
		teller.withdrawAll();
		
		Thread[] threads = new Thread[5];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(teller);
			
		}
		
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

}
