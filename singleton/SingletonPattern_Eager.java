package com.java.singleton;

//Eager Initialization 
class  Student{
	private int id;
	private String name;
	private int age;
	private static  Student stu = new Student();
	
	private Student(){
		System.out.println("IN ctor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static Student getInstance() {
		
		return stu;
	}
	
}


public class SingletonPattern_Eager {
	public static void main(String[] args) {
		Employee emp = Employee.getInstance();
		Employee emp1 = Employee.getInstance();
		
		if(emp == emp1) {
			System.out.println("Equal");
		}
	}
	

}





