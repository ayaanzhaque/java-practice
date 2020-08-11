package jrJava.recursion3;

import java.io.File;

public class UsingFileObject {

	public static void main(String[] args) {
		
		String path = "jrJava/sorting_bubble";
		File file = new File(path);
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		
		File[] children = file.listFiles();

		for(int i = 0; i < children.length-1; i++){
			System.out.println(children[i].getName());
			System.out.println(children[i].isDirectory());
			System.out.println(children[i].length());
			System.out.println();
		}
		
		
	}

}
