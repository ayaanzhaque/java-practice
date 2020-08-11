package jrJava.linkedList_4;

import java.util.NoSuchElementException;

public class MyIterator {

	LinkedList list;
	Link current;
	Link previous;
	
	public MyIterator(LinkedList list){
		this.list = list;
	}
	
	public void reset(){
		current = null;
		previous = null;
	}
	
	public boolean hasNext(){
		if(current==null && previous==null) return list.first!=null;
		return current.next!=null;
	}
	
	public Link next(){
		if(current==null && previous==null){
			current = list.first;
		}
		else {
			previous = current;
			current = current.next;
		}
		return current;
	}
	
	
	public void remove() {   
		if(current==null) throw new NoSuchElementException(); 
		
		if(previous==null){
			list.first = list.first.next;
			reset();
		}
		else {
			previous.next = current.next;
			current = previous;
		}
	}
}









