//WAP to find reverse of number
package corejavaproject;

import java.util.Scanner;

public class ReverseNumber
{

	public static void main(String[] args) 
	{
		int n,rem,reverse=0,temp;
		Scanner sc=new Scanner(System.in);
		
		//input number from user 
		System.out.println("Enter numbers to reverse:");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		System.out.println("reverse of "+temp+" is:" +reverse);
		
		if(temp==reverse)
			System.out.println(temp+ "is palindrome number");
		else
	System.out.println(temp+ "is  not palindrome number");

	}

}
