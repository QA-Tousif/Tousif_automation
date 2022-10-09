package com.constructor;

public class ClassA {
	
	public ClassA(int age,String Name ) {
		System.out.println(age + Name);
	}
	public ClassA(int salary) {
			System.out.println(salary);
		}
	public ClassA(String Name) {
			System.out.println(Name);
		}
	
public static void main(String[] args) {
ClassA obj = new ClassA(25, " bike");
ClassA obj2 = new ClassA(1000);
ClassA obj3 = new ClassA("BMW");

}	
	
}
