package com.abstruction;

public class AbstructionB extends AbstructionA {
	
	public void getCash(){
		System.out.println("100");
	}
	public void getCar() {
		System.out.println("BMW");
	}
 public static void main(String[] args) {
	 AbstructionB obj = new AbstructionB();
	 obj.getCar();
	 obj.getHouse();
	 obj.getCash();
}
}
