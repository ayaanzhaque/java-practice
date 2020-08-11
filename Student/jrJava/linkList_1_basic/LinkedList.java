package jrJava.linkList_1_basic;


public class LinkedList {

	private Link first;
	
	
	
	public LinkedList(){
		first = null; // redundant
	}
	
	public boolean isEmpty(){ 
		return first==null;
	}
	
	public int size(){
		int count = 0;
		Link current = first;
		while(current!=null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	public void insertAtBeginning(int id, double value){
		Link link = new Link(id, value);
		link.next = first;
		first = link;
	}

	
	public Link removeFirst(){
		Link temp = first;
		if(first!=null) first = first.next;
		return temp;
	}
	
	
	
	public void insertAtEnd(int id, double value){
		Link link = new Link(id, value);
		
		if(first==null){
			first = link;
			return;
		}
		
		Link current = first;
		while(current.next!=null){
			current = current.next;
		}
		current.next = link;
	}
	
	
	public Link removeEnd(){
		if(first==null) return null;
		
		Link current = first;
		Link previous = null;
		
		while(current.next!=null) {
			previous = current;
			current = current.next;
		}
		
		if(previous==null) first = null;
		else previous.next = null;
		
		return current;
		
	}
	
	public void insert(int id, double value) {
		Link link = new Link(id, value);
		
		Link current = first;
		Link previous = null;
		
		while(current!=null && current.id<id) {
			previous = current;
			current = current.next;
		}
		
		if(previous == null && first==null) {
			link.next = first;
			first = link;
		}
		
		previous.next = link;
		link.next = current;
		
		
		
	}
	
	
	public void printAll(){
		Link current = first;
		while(current!=null){
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
	}
	
}










