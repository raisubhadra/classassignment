package oopsconcept;

class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	
	}
	double add(double a,int b)
	{
		return a+b;
	
	}
	double add(int a,double b)
	{
		return a+b;
	}
}

public class MethodOverloading
{

	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
      System.out.println(calc.add(10, 45,20));
	}

}
