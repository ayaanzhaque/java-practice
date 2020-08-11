package jrJava.inheritance4;

public class Test {

	public static void main(String[] args) {
		/*
		B ref = new B();
		ref.mB();
		ref.miA();
		ref.miB();
		
		I ref2 = new B();
		ref2.miA();
		ref2.miB();*/

		D ref1 = new D();
		B ref2 = ref1;
		I ref3 = ref2;
		A ref4 = ref2;
		
		A ref100 = new D();
		B ref101 = (B) ref100;
		
		
	}

}
