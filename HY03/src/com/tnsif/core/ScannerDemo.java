package com.tnsif.core;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Name is: " + name);
		in.close();
	}

}
