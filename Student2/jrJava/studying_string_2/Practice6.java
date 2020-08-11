package jrJava.studying_string_2;

public class Practice6 {

	public static void main(String[] args){
		
		String message = "The Ministry of Magic blames Harry anyway, and the Dursleys confiscate Harry's books and wand.";
		
		String reverse = "";
		
	//	for(int i = message.length()-1; i < message.length(); i--){
		//	reverse = reverse + message.charAt(i);
		//}
		//System.out.println(reverse);
		
		StringBuilder sb = new StringBuilder();
		for(int i = message.length()-1; i >= 0; i--){
			sb.append(message.charAt(i));
		}
		
		sb.toString();
		
		
	}
	
	
	
}
