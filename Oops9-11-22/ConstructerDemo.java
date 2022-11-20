package oopsconcept;

class Employee
{
	int id;
	String name,designation;
	double basicSalary;
	
	//parameterzied salary
	public Employee(int id,String name,String designation,double basicSalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("basicSalary:"+basicSalary);
	}
}

public class ConstructerDemo
{
	public static void main(String[]args)
	{
		Employee emp1=new Employee(101,"subhadra","java stack dev",50000);
		Employee emp2=new Employee(102,"palak","devloper",30000);
		emp1.display();
		emp2.display();
	}
}

	
