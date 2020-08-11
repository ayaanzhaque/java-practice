package jrJava.prep_objects_for_dataStructures_2;


public class Thing {

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
	
	
	//public int hashCode(){
		
	//}
	
}











