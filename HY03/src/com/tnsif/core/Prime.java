package com.tnsif.core;
import java.util.Scanner;
public class Prime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,counter;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the n value : ");
	      n=scanner.nextInt();
	      System.out.println("Prime numbers between 1 to n:");
	      for(j=2;j<=n;j++)
	      {
	         counter=0;
	         for(i=1;i<=j;i++)
	         {
	            if(j%i==0)
	            {
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.print(j+" ");
	      }
	}

}
