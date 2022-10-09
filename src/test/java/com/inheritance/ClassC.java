package com.inheritance;


public class ClassC extends ClassB {
		public void getJob() {
			System.out.println("IT");
		}
		
		public void getBike() {
			System.out.println("Bike");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ClassC obj = new ClassC();
			obj.getCash();
			obj.getsPropeprties();
			obj.getCar();
			obj.getBike();
			obj.getJob();
		}

	}


