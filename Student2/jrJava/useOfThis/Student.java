package jrJava.useOfThis;

public class Student {

	private int id;
	private String name;
	private double GPA;
	private boolean honor;
	
	public Student(){
		id = 101;
		name = "John Doe";
		GPA = 2.5;
		honor = true;
	}
	
	public Student(int id){
		this.id = id;
		this.name =  name;
		GPA = 2.5;
		honor = true;
		
	}
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
		GPA = 2.5;
		honor = true;
	}
	
	public void myMethod(){
		myMethod(101);
	}
	
	public void myMethod(int id){
		myMethod(101, "John Doe");
	}
	
	public void myMethod(int id, String name){
		this.id = id;
		this.name = name;
		GPA = 2.5;
		honor = true;
	}
	
}
