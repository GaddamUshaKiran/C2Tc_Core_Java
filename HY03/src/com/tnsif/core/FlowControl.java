package com.tnsif.core;

public class FlowControl {
	private static boolean a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setA(true);

		if(setA(false))
		{
			System.out.println("Hello H03");
		}
		else
		{
			System.out.println("Hello");
		}

		int x=0;
		if(x==20)
			System.out.println("Hello H03");
		else
			System.out.println("Hello");

		//if(true)
			// int x=10;  //no declarative statement
		//else
			//System.out.println("Hello");

		if(true)
			if(true)
				System.out.println("Hello H03");
//			else
//				System.out.println("Hello");
	}

	public static boolean isA() {
		return a;
	}

	public static boolean setA(boolean a) {
		FlowControl.a = a;
		return a;
	}

}
