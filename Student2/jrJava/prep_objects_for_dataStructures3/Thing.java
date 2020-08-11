package jrJava.prep_objects_for_dataStructures3;


public class Thing implements Comparable{

	private int a;
	
	public Thing(int a){
		this.a = a;
	}
	
	public int getA(){ return a; }
	
	
	public String toString(){
		return "Thing [a=" + a + "]";
	}
	
	
	public boolean equals(Object o){  // Do not do equals(Thing o) --> overloading, not overriding.
		if(!(o instanceof Thing)) return false;
		Thing t = (Thing) o;
		return a == t.a;
	}

	
	public int compareTo(Object o) {
		Thing t = (Thing) o;
		if(a>t.a) return 1;
		else if(a<t.a) return -1;
		else return 0;
		
	}
	
	
	
	
}











