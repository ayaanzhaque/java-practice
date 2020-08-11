package jrJava.prep_objects_for_dataStructures3;

import java.awt.Color;

public class Practice2 {

	Student temp;
	
	public static void main(String[] args) {
		
		Student[] studs = new Student[2];
		
		studs[0] = new Student("Billy", 106, 'D', 4.02, Color.red);
		studs[1] = new Student("Emily", 111, 'B', 3.98, Color.magenta);
		
		
		if(studs[0].compareTo(studs[1]) == 1){
			int temp = studs[0];
			studs[0] = studs[1];
			
		}
	}

}
