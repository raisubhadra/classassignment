//write a program to to check if the email id is valid or not?
package arrayExamples;
import java.util.Scanner;
public class EmailValidity
{

	public static void main(String[] args) 
	{
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your email id: ");
		email= sc.nextLine();
		if((email.endsWith(".com"))||(email.endsWith(".org"))||(email.endsWith(".in")))
		{
			System.out.println("your email Id is valid.");
		}
		else
			System.out.println("Please enter correct email id!");

	}

}
