package jrJava.inheritance8_polymorphism;

public class B extends A{

	public int f = 20;
	public void m(){ System.out.println("Bs m(), f = " + f); }
	public void m2(){ System.out.println("Bs m2(), f = " + f); }
	
	public static int sf = 200;
	public static void sm(){ System.out.println("Bs sm(), sf = " + sf); }
	
	
}
