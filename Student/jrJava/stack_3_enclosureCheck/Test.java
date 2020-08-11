package jrJava.stack_3_enclosureCheck;

public class Test {

	public static void main(String[] args) {
		
		String exp = "3*{a-(4.0+b}/6.01) + c)/f";
		
		EnclosureChecker checker = new EnclosureChecker(exp);
		checker.check();
	}

}
