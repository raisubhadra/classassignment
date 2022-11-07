package corejavaproject;

import java.util.Scanner;

public class NestedIfAndLogisticOpertor 
{

	public static void main(String[] args)
	{
		int num1,num2,num3,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		num1=sc.nextInt();  //20
		num2=sc.nextInt();   //50
		num3=sc.nextInt();   //300
		if((num1>num2)&&(num1>num3))
			max=num1;
		else if((num2>num1)&&(num2>num3))
			max=num2;
		else if((num3>num1)&&(num3>num2))
			max=num3;
		System.out.println("Maxmimum among all three:"+ max);
		
		}
}
