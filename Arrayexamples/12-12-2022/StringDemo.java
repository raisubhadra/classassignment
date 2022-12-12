package arrayExamples;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String str1="subhadra";
		String str2="subhadra";
		String str3="Welcome";
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		str1.concat("Rai");//create new instance 
		System.out.println(str1);
		
		char c=str1.charAt(5);
		System.out.println(c);
		
		//String s=new String("Welcome");
		//String s1=new String("Welcome");
		//System.out.println(s==s1);
		
		}
	}
