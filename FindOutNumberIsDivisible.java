package corejavaproject;

import java.util.Scanner;

public class FindOutNumberIsDivisible 
{
public static void main(String[] args)
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number is divisible by 5 and 11");
	num=sc.nextInt();
	if((num%5==0)&&(num%11==0))
	{
		System.out.println(num+" divisible by 5and 11 ");
	}
	else
	{
		System.out.println(num+" not divisible by 5and 11 ");	
	}
}
}
