package com.tnsif.core;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooty Activa = new Scooty();
		Activa.noOfWheels();
			}

		}
		abstract class Vehicle //partially implemented class-cannot create objects
		{
			abstract void noOfWheels();
		}

		class Scooty extends Vehicle
		{
			@Override
			void noOfWheels()
			{
				System.out.println(2);
	}

}
