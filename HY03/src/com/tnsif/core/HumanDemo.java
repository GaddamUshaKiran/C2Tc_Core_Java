package com.tnsif.core;

public class HumanDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1 using getters and setters
		//default constructor
		Human h1=new Human();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		String city=sc.next();

//		h1.setHumanName(name);
//		h1.setHumanAge(age);
//		h1.setHumanCity(city);
//		
//		System.out.println(h1.getHumanName());
//		System.out.println(h1.getHumanAge());
//		System.out.println(h1.getHumanCity());

//method 2 using constructor		//parameterized constructor

		h1=new Human(name,age,city);
		System.out.println(h1.getHumanName());
		System.out.println(h1.getHumanAge());
		System.out.println(h1.getHumanCity());
		System.out.println("Parameterized constructor executed");
		sc.close();

	}

}
