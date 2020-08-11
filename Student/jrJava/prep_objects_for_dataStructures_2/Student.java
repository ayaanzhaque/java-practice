package jrJava.prep_objects_for_dataStructures_2;

import java.awt.Color;

public class Student {

		private String name;
		private int id;
		private char classRoom;
		private double gpa;
		private Color fColor; //favorite color
		
		public Student(String name, int id, char classroom, int gpa, Color FColor){
			this.name = name;
			this.id = id;
			this.classRoom = classroom;
			this.gpa = gpa;
			this.fColor = fColor;
		}
		
		public String toString(){
			return "Student { name = " + name + ", id= " + id + ", classRoom = " + classRoom + ", GPA = " + gpa + ", favoriteColor = " + fColor + "]";
			//return "Student { name = " + name + ", id= " + id + ", classRoom = " + classroom + ", GPA = " + gpa + ", favoriteColor = " + fColor + "]";

		}
		
		public boolean equals(Object o){
			if(!(o instanceof Student)) return false;
			Student s = (Student) o;
			
			//return name == s.name && classRoom==s.classRoom && fColor ==s.fColor; //option 2 THIS IS WRONG!!!
			return name.equals(s.name) && classRoom==s.classRoom && fColor.equals(s.fColor); 
		}
		
		
}
