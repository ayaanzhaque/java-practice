package jrJava.linkList_1_basic;


public class Link {

	public Link next;
	
	public int id;
	public double value;
	
	public Link(int id, double value){
		this.id = id;
		this.value = value;
	}
	
	public String toString(){
		return "[" + id + ", " + value + "]";
	}
	
	// what more methods?
}










