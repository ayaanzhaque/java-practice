package jrJava.studying_wrapper_2;

public class Practice1 {

	public static void main(String[] args) {
		
		Integer a1 = new Integer(253); //not good way
		
		int a2 = a1.intValue();
		
	//	System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		
		String exp1 = "11";
		String exp2 =  "22";
		System.out.println(exp1 + exp2);
		
		int q1 = Integer.parseInt(exp1);
		int q2 = Integer.parseInt(exp2);
		System.out.println(q1 + q2);
		
		Double pi = new Double(3.14);
		
		double piValue = pi.doubleValue();
		
		String n1 = "1.11";
		String n2 = "2.22";
		System.out.println(n1+n2);
		
		System.out.println(Double.parseDouble(n1) + Double.parseDouble(n2));
		
	}

}
