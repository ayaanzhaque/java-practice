package jrJava.studyinh_String_1;

public class Practice3 {

	public static void main(String[] args) {
		
		String message = "   I love you so much, Sir!       ";
		System.out.println(message.length());
		System.out.println(message);
		
		String message2 = message.trim();
		System.out.println(message2.length());
		System.out.println(message2);
		
		String exp1 = "I Love You So Much, Sir!";
		String exp2 = exp1.toUpperCase();
		System.out.println(exp2);
		String exp3 = exp1.toLowerCase();
		System.out.println(exp3);
		
		String exp4 = exp1.replace("so much", "not at all");
		System.out.println(exp4);
		
		String exp5 = exp1.replace("i", "I");
		

	}

}
