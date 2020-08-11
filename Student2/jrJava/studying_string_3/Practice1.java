package jrJava.studying_string_3;

public class Practice1 {

	public static void main(String[] args) {
		
		Thing t1 = new Thing(100, 210);
		Thing t2 = new Thing(100,210);
		System.out.println(t1==t2);
		
		String s1 = "abcde";
		String s2 = "abcde";
		System.out.println(s1==s2);
		
		String p1 = "hello there!";
		p1 = null;
		String p2 = "hello there!";
		
		new String("Hello");
		
		String r1 = "abc";
		String r2 = "abc";
		String r3 = new String("abc");
		String r4 = new String("abc");
		System.out.println();
		System.out.println();
		
		
	}

}
