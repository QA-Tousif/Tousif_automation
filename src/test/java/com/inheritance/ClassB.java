package com.inheritance;

public class ClassB extends ClassA{
	  
	public void getCar() {
		System.out.println("BMW");
	}
	
	public void getCash() {
		System.out.println("1m");
	}
public static void main(String[] args) {
	ClassB obj = new ClassB();
	obj.getCash();
	obj.getsPropeprties();
	obj.getCar();
	
}
}