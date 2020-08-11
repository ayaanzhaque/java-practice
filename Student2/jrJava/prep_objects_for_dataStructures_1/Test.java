package jrJava.prep_objects_for_dataStructures_1;

public class Test {

	public static void main(String[] args) {

		Thing t1 = new Thing(100);
		
		String description = t1.toString();
		System.out.println(description);
		
		System.out.println(t1);
		
		Thing t2 = new Thing(100);
		
		boolean result = t1.equals(t2);
		System.out.println(result);
	
		
	}

}
