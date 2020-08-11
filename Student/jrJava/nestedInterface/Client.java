package jrJava.nestedInterface;

public class Client {

	private int id;
	
	public Client(MarketWatcher mw, int cid) {
		mw.addCallback(new CallbackHelper);
		id = cid;
	}
	
	
	
	private class CallbackHelper() implements MartketWatcher.Callback{
		public void onReady() {
			System.out.println(id + ": MW is ready. I should stand by.");
		}
		
		public void onStatusChange(String change) {
			System.out.println(id + ": There was a change of" + change + "occured. I should do something about it.");
		}
	
	
	}	
}
