package oopsconcept;

class A
{
	public A()
	{
		System.out.println("this is default constructor!!");
	}
	public A(int a)
	{
		this();//invoke default constructor
		System.out.println("the value of a is:"+a);
	}
	public A(float b)
	{
		this(10);//invoke parameterized constructor
		System.out.println("the value of a is:"+b);
	}
}

public class DefaultConstructer 
{

	public static void main(String[] args)
	
		
		{
			A obj=new A(30.7f);
		}
	
}
