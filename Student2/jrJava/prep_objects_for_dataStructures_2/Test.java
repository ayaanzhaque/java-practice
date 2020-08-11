package jrJava.prep_objects_for_dataStructures_2;

public class Test {

	public static void main(String[] args) {
		
		Thing t1 = new Thing(100);
		
		String description = t1.toString();
		System.out.println(description); 
		
		System.out.println(t1); // System.out.println(t1.toString()); 
		
		
		Thing t2 = new Thing(100);
		
		boolean result1 = t1.equals(t2);
		System.out.println(result1);
		
		Thing t3 = t1;
		
		boolean result2 = t1.equals(t3);
		System.out.println(result2);
	}

} 
 