package com.tnsif.core;

public class Person {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
	    System.out.println("Enter the name=");
        String name=obj.next();

        System.out.println("Enter the age of the person=");
        int age=obj.nextInt();

        System.out.println("Enter the gender");
        String gender=obj.next();

        System.out.println("Enter the income=");
        int income=obj.nextInt();

        PersonDemo person=new PersonDemo();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        ((Person) person).setIncome(income);

        System.out.println(person);     
	}
private void setAge(int age2) {
// TODO Auto-generated method stub

}
private void setName(String name2) {
// TODO Auto-generated method stub

}
private void setGender(String gender2) {
// TODO Auto-generated method stub

}
private void setIncome(int income2) {
// TODO Auto-generated method stub

}
private String gender;
private String income;
private String name;
private String age;
private String tax;
public String toString() {
return "PersonDemo [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax="
		+ tax + "]";
}
public int getIncome() {
// TODO Auto-generated method stub
return 0;
}
public void setTax(int i) {
// TODO Auto-generated method stub

}
public Object getGender() {
// TODO Auto-generated method stub
return null;
}
public int getAge() {
// TODO Auto-generated method stub
return 0;
	}

}
