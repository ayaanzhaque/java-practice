package jrJava.studyinh_String_1;

public class Practice1 {

	public static void main(String[] args) {
		
		String a1 = new String("abcd"); //wrong
		String a2 = "abcd"; //right
		
		String phrase = "I love you, Sir";
		
		//char ch = phrase.charAt(30);
		//System.out.println(ch);
		
		int len = phrase.length();
		System.out.println(len);
		
		
		char ch = phrase.charAt(phrase.length()-1);
		System.out.println(ch);
		
		for(int i = 0; i < phrase.length(); i++) System.out.println(phrase.charAt(i));
		
		boolean ans1 = phrase.startsWith("I lo");
		System.out.println(ans1);
		
		boolean ans2 = phrase.startsWith(" I lo");
		System.out.println(ans2);
		
		boolean ans3 = phrase.endsWith("r!");
		System.out.println(ans3);
		
		
		
	}

}
