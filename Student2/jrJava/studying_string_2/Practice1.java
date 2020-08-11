package jrJava.studying_string_2;

public class Practice1 {

	public static void main(String[] args) {
		
		String exp1 = "lunch";
		String exp2 = " ";
		String exp3 = "dinner";
		
		String combined1 = exp1.concat(exp2);
		
		String combined2 = combined1.concat(exp3);
		
		System.out.println(combined2);
		
		"chapter1".concat("chapter2").concat("chapter3").concat("chapter4").concat("chapter5");
		
		int sum = 10+20+35;
		String piece = String.valueOf(sum);
		
		System.out.println(piece);
		
		boolean answer = true;
		String pece2 = String.valueOf(answer);
		
		
	}

}
