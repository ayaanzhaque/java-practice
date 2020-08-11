package jrJava.inheritance8_polymorphism;

public class A {

	public int f = 10;
	public void m(){ 
		System.out.println("As m(), f = " + f); 
		m2();
	}
	public void m2(){ System.out.println("As m2(), f = " + f); }
	
	public static int sf = 100;
	public static void sm(){ System.out.println("As sm(), sf = " + sf); }
	
}
