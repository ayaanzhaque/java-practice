package jrJava.inheritance5;

import jrJava.inheritance2.*;

public class Test {

	public static void main(String[] args) {
		
		//Object ref = new Object();
		
		Animals ref = new Husky();
		
		System.out.println(ref.getClass());
		
		String description = ref.toString();
		System.out.println(description);

	}

}
