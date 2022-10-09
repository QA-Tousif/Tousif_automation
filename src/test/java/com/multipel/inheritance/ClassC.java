package com.multipel.inheritance;

public class ClassC implements ClassA, ClassB {
	public void getJob(){
		System.out.println("IT");
	}
	public void getBike(){
		System.out.println("Bike");
	}
	public void getsPropeprties(){
		System.out.println("home");
	}
		public void getCar(){
			System.out.println("BMW");
		}
			public void getCash(){
				System.out.println("1m");
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj = new ClassC ();
		obj.getBike();
		obj.getCar();
		obj.getCash();
		obj.getClass();
		obj.getJob();
		obj.getsPropeprties();
		
	}

}
