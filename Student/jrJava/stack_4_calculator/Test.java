package jrJava.stack_4_calculator;

public class Test {

	public static void main(String[] args) {
		String exp = "3.1512 * (14.1+2.1*(25.9-11.9/12)+4.2^2.0.4%4.0+0.001";
		Calculator cal = new Calculator(exp);
		cal.calculate();
		
		

	}

}
