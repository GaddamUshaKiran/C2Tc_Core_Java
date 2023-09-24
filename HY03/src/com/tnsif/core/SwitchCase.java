package com.tnsif.core;

public class SwitchCase {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='z';
		switch(x)
		{
		case'l':
		case'L':
			System.out.println(x+ "is a letters");
			break;
		case'd':
		case'D':
			System.out.println(x+ "is a digits");
		    break;
		case'w':
		case'W':
			System.out.println(x+ "is a words");
			break;
		case's':
		case'S':
			System.out.println(x+ "is a symbols");
			break;
			default:
				System.out.println(x+ "is other than,letters,digits,words,symbols");

		}
	}

}
