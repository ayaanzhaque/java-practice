package jrJava.studying_string_2;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice5 {

	public static void main(String[] args) throws Exception{
		
		
		Scanner scanner = new Scanner(new File("jrJava/studying_string_2/content.txt"));
		String line;
		StringTokenizer st;
		String each;
		int count = 0;
	
		
		while(scanner.hasNextLine()){
			line = scanner.nextLine();
			
			
			st = new StringTokenizer(line, "-;;,. \"");
			
			while(st.hasMoreTokens()){
				each = st.nextToken();
				
				//if(each.length() >= 10){
					//count++;
					//System.out.println(count);
					//System.out.println(each);
			//	}
				
				
				//count++;
				
				//if(each.indexOf("pp") >= 0){
					//count++;
					//System.out.println(count);
					//System.out.println(each);
				//}
				
				
				int posS = each.indexOf('s');
				
				if(posS >= 0){
					if(each.indexOf('p', posS+1) >=0 ){
						count++;
						System.out.println(count);
						System.out.println(each);
					}
				}
				
				
				
			}
			
			

		}
		
		
		
	}

}
