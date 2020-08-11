package jrJava.sorting_objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

	
	public static void print(Object[] data){
		System.out.println("[" + data[0]);
		for(int i=1; i<data.length-1; i++) System.out.println(" " + data[i]); 
		System.out.println(" " + data[data.length-1] + "]");
		System.out.println();
	}
	
	
	public static Balls[] loadEmployeeArrayFromFile(String filePath){
		
		Balls[] balls = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			balls = new Balls[count];
			count = 0;
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				
				balls[count] = new Balls(line);
				count++;
			}
			s.close();
			
			
		} catch (FileNotFoundException e) { }
		
		return balls;
	}
	
}





