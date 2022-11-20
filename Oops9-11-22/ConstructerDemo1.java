package oopsconcept;

import java.util.Scanner;

class emp
{
	int id;
	String name,designation;
	double basicSalary;
	static String organisation="Anudip";// class/static variable
	//parameterized constructor//it will not return any value explicity,implicity
	//it will return refernce of object 
	public emp(int id, String name,String desigination,double basicSalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter organization:");
		organisation=sc.nextLine();
	}
	static void changeOrganisiation()
	{
		organisation="Anudip Foundation";
	}
	public void display()
	{
	System.out.println("Id: "+this.id+" "+"Name: "+this.name+" "+"designation: "+this.designation+" "
			+ ""+"Basic salary: "+this.basicSalary+" "+"Organisation: "+organisation);
	}
}


public class ConstructerDemo1 
{
	//static String name;
	//
	//static void display()
	//{
	//}
	
     public static void main(String[] args) 
	{
		Employee emp1=new Employee(101,"subhadra","java stack dev",50000);
		Employee emp2=new Employee(102,"palak","devloper",30000);
		emp1.display();
		emp2.display();
    }
}
/*
 * 1.default constructor(no-args)-which will assign deafault
 * 2.parameterized constructor-which will assign different
 * */
