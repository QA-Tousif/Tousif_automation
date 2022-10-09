package com.polymorphism;

public class MethodOverloding {

	public void getInfo(int age) {
		System.out.println(age);
		
	}
	public void getInfo(int salary, String name) {
		System.out.println(salary);
		System.out.println(name);
	}
	public void getInfo(String name, int salary) {
		System.out.println(name);
		System.out.println(salary);
	}
	public void getInfo(long time, int age) {
		System.out.println(time);
		System.out.println(age);
	}
	public void getInfo(int age, int salary) {
		System.out.println(age);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		MethodOverloding obj = new MethodOverloding();
		obj.getInfo(50);
		obj.getInfo(25, 100000);
		obj.getInfo(100000, "Tousif");
		obj.getInfo(2,25);
}
}