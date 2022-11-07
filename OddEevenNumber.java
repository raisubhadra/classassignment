package corejavaproject;

import java.util.Scanner;

public class OddEevenNumber {
public static void main(String[] args)
{
int num;
Scanner sc =new Scanner(System.in);
System.out.println("enter number to check even or odd :");
num=sc.nextInt();

if(num%2==0)
	System.out.println(num+" is even number");
else
	System.out.println(num+" is odd number");
}
}



