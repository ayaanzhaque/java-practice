package jrJava.Declarations;

import trace.Trace;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int sirWeight = 104;
	int myWeight = 220;
	myWeight = myWeight + sirWeight/2;
	sirWeight = sirWeight/2;
	System.out.println("Sir Weight is " + sirWeight);
	System.out.println("My Weight is " + myWeight);
	
	Trace.trace("jrJava.Declarations", "Practice2");	
	}

}
