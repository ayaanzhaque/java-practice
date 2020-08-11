package jrJava.linkedList_3;

import java.util.Iterator;

public class Client2 implements Runnable {

	LinkedList list;
	
	public void run(){
		Iterator iter = new MyIterator(list);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
 