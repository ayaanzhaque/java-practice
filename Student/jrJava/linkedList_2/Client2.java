package jrJava.linkedList_2;


public class Client2 implements Runnable {

	public LinkedList list;
	
	public void run(){
		Link each;
		list.reset();
		while(list.hasNext()){
			each = list.next();
			System.out.println("t2: " + each); 
		}
	}
	
}

