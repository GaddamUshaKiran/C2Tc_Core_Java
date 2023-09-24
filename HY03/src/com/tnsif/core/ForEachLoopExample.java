package com.tnsif.core;

public class ForEachLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		//for integer array
		for (int i:a) //iterative elements
		{
			System.out.println(i);
		}
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println("");
		String s1[]= {"java","programming","leraning"};
		//for string array
		for(String s:s1)
		{
			System.out.println(s+"");
		}
	}

}
