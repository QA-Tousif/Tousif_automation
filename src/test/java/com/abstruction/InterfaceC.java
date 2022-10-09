package com.abstruction;

public class InterfaceC implements InterfaceA{

	public void getProperties() {
		System.out.println("Home");
	}
	public void getCar() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		InterfaceC obj = new InterfaceC();
		obj.getProperties();
		obj.getCar();
	}
}
