package corejavaproject;

import java.util.Scanner;

public class MaximumAmongThreeDigits {

	public static void main(String[] args) {
	int num1,num2,num3,max;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three numbers");
	num1=sc.nextInt();  //200
	num2=sc.nextInt();   //50
	num3=sc.nextInt();   //30
	
	if(num1>num2) //external  200>50t
	{
		if(num1>num3) //internal  200>30t
		{
			max=num1;
		}
		else   //internal else
		{
			max=num3;
		}
	} //external if
	else //external else
	{
		if(num2>num3) //internal if 50>30t
		{
			max=num2;
		} 
		else//internal else
		{
			max=num3;
		}
	}
	
	System.out.println("Maximum number among all three is: "+ max);
	
	}

}