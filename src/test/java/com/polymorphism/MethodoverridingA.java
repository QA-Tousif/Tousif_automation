package com.polymorphism;

public class MethodoverridingA extends MethodOverriding {

	public void getProperties() {
		System.out.println("House");
	}
	public void getCash() {
		System.out.println("100");
	}
	public static void main(String[] args) {
		MethodoverridingA obj = new MethodoverridingA ();
		obj.getBike();
		obj.getCar();
		obj.getMotorcycle();
		obj.getCash();
		obj.getProperties();
	}
}
