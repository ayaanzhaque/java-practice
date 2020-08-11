package jrJava.linkedList_3;

import java.util.Iterator;

public class MyIterator implements Iterator {

	LinkedList list;
	Link current;
	
	public MyIterator(LinkedList list){
		this.list = list;
	}
	
	public void reset(){
		current = null;
	}
	
	public boolean hasNext(){
		if(current==null) return list.first!=null;
		return current.next!=null;
	}
	
	public Link next(){
		if(current==null) current = list.first;
		else current = current.next;
		return current;
	}
	
	//public void remove(){  }
}



