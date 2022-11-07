package corejavaproject;

public class VowelOrConsnant 
{
public static void main(String[] args) 
{
char ch='I';
if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
System.out.println( ch+ " is vowel ");

else if((ch>=48)&&(ch<=57))
	System.out.println(ch+ " is number ");
	
else
	System.out.println(ch+ " is constant ");
	}

}
