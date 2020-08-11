package jrJava.object1_basic;

public class Test2 {

	public static void main(String[] args) {
		
		Student aaa = new Student();
		aaa.grade = 8;
		aaa.classroom = 'B';
		aaa.socialScienceScore  = 83;
		aaa.isHonorsStudent = false;
		aaa.isSuspended = true;
		
		double gpa = aaa.calculateGPA();
		
		aaa.changeClassroomTo('h');
		
		System.out.println();
		
		

	}

}
