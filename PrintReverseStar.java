package corejavaproject;

import java.util.Scanner;

public class PrintReverseStar
{

	public static void main(String[] args)
	
	{

		for(int i=5;i>=1;i--)//row
	{
		for(int j=1;j<=i;j++)//column
			
		{
			System.out.print("*");
			}//end of internal loop 
		System.out.println();// print new line

	}//end of external loop


	}

}
