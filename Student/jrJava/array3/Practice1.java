package jrJava.array3;

public class Practice1 {

	public static void main(String[] args) {
		
		Student[] students= new Student[5];		
		
		students[0] = new Student(101, "John", 2.5);
		students[1] = new Student(102, "Dick", 3.5);
		students[2] = new Student(103, "Harry", 3.1);
		students[3] = new Student(104, "Sally", 2.2);
		students[4] = new Student(105, "Brian", 1.9);
		
		for(int i = 0; i < students.length; i++) students[i].print();
		System.out.println();
		for(int i = 0; i < students.length; i++) students[i].increaseGPA(0.5);
		for(int i = 0; i < students.length; i++) students[i].print();
		System.out.println();
		

	}

}
