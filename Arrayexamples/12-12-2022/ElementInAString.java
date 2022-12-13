//Write a program to search a given element in a string
package arrayExamples;
import java.util.Scanner;

public class ElementInAString 
{
    public static void main(String[] args) 
	{
        String input;
		char ch;
		int i;
        
		System.out.println("Enter String to search a given element in a string ");
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine(); //Hello good morning
        
        System.out.println("Enter the character from input ");
        ch=sc.next().charAt(0);
        for( i=0;i<input.length();i++)
        {
        	if(input.charAt(i)==ch)
        	{
        		break;
        	}
        		}
        System.out.println(ch+"is present at position "+ i);
        	}
    
          }
        
        

	


