package com.java.singleton;

//Lazy Initialization
class  Employee{
	private int id;
	private String name;
	private int age;
	private static Employee emp ;
	
	private Employee(){
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
	
	//Normal getInstance
//	public static Employee  getInstance() {
//		if(emp == null) {
//			emp = new Employee();
//		}
//		return emp;
//	}
	
	// Using synchronized block 
	public static Employee getInstance() {
		if(emp == null) {
			synchronized (Employee.class) {
				if(emp == null) {
					emp = new Employee();
				}
			}
		}
		return emp;
	}
	
}

public class SingletonPattern_Lazy {
		public static void main(String[] args) {
			Employee emp = Employee.getInstance();
			Employee emp1 = Employee.getInstance();
			
			if(emp == emp1) {
				System.out.println("Equal");
			}
			
		}
}













