package jrJava.nestedInterface;

public class Test {

	public static void main(String[] args) {
		MarketWatcher mw = new MarketWatcher();
		
		Client c1 = new Client(mw, 101);
		Client c2 = new Client(mw, 102);
		Client c3 = new Client(mw, 103);
		
		mw.hasBecomeReady();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
