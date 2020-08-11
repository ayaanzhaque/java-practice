package jrJava.inheritance3;

import jrJava.inheritance1.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A ref1 = new C();
		//ref1.mA();
		
		C ref1 = new C();
		A ref2 = ref1;
		C ref3 = (C) ref2;
	}

}
