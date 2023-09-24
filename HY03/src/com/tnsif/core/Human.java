package com.tnsif.core;

public class Human {

		String HumanName;
		int HumanAge;
		String HumanCity;
		public String getHumanName() {
			return HumanName;
		}
		public void setHumanName(String humanName) {
			HumanName = humanName;
		}
		public int getHumanAge() {
			return HumanAge;
		}
		public void setHumanAge(int humanAge) {
			HumanAge = humanAge;
		}
		public String getHumanCity() {
			return HumanCity;
		}
		public void setHumanCity(String humanCity) {
			this.HumanCity = humanCity;
		}
		//parameterized constructors
		public Human(String humanName, int humanAge, String humanCity) {
			super();
			this.HumanName = humanName;
			this.HumanAge = humanAge;
			this.HumanCity = humanCity;
		}
		//no argument constructors
		public Human()
		{
			System.out.println("I am default constructor");
	}

}
