package com.encapsulation;

public class ClassA {
	private String name = "Sali";
	private int salary = 95000;
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		//obj.name();
		//obj.salary();
	System.out.println("Name: " + obj.getName());
	System.out.println("Salary: " + obj.getSalary());
	}
	
	

}
