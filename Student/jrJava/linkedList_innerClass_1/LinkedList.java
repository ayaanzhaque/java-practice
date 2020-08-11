package jrJava.linkedList_innerClass_1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> {

	public Link<E> first;

	public LinkedList(){
		first = null; // redundant
	}
	
	public iterator() {
		
	}

	public boolean isEmpty(){ 
		return first==null;
	}

	public int size(){
		int count = 0;
		Link<E> current = first;
		while(current!=null){
			count++;
			current = current.next;
		}
		return count;
	}




	public Link<E> removeFirst(){
		Link<E> temp = first;
		if(first!=null) first = first.next;
		return temp.data;
	}



	/*	public void insert(int id, double value){
		Link link = new Link(id, value);

		Link current = first;
		Link previous = null;

		while(current!=null && current.id<id){
			previous = current;
			current = current.next;
		}

		if(previous==null){
			if(first!=null) link.next = first;
			first = link;
		}
		else { 
			previous.next = link;
			link.next = current;
		}
	}
	 */




	public void add(E data){
		Link link = new Link<E>(data);

		if(first==null){
			first = link;
			return;
		}

		Link<E> current = first;
		while(current.next!=null){
			current = current.next;
		}
		current.next = link;
	}

	//For development purpose
	public void printAll(){
		Link<E> current = first;
		while(current!=null){
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
	}

}

	public class MyIterator implements Iterator<E>{
	
		
		Link<E> current;
		Link<E> previous;
	
		
		public void reset(){
			current = null;
			previous = null;
		}
	
		public boolean hasNext(){
			if(current==null && previous==null) return list.first!=null;
			return current.next!=null;
		}
	
		public E next(){
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
	
	
	private class Link<T> {
	
		public Link<T> next;
	
		public T data;
	
	
		public Link(T data){
			this.data = data;
		}
	
		public String toString(){
			return "[" + data.toString() + "]";
		}
	
		// what more methods?
	}
	
	
	
	
	
	
	
	
	
















