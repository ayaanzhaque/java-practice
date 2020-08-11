package jrJava.inheritance8_polymorphism;

public class C extends B{

	public int f = 30;
	public void m(){ System.out.println("Cs m(), f = " + f); }
	public void m2(){ System.out.println("Cs m2(), f = " + f); }
	
	public static int sf = 300;
	public static void sm(){ System.out.println("Cs sm(), sf = " + sf); }
	
	
}
