package oopsconcept;
import java.util.Scanner;
class AgeNotValidForVaccinationException extends Exception
{
public AgeNotValidForVaccinationException(String str)
{
System.out.println(str);
}
}
public class Vaccine {
public static void main(String[] args) 
{
int age=0;
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter age");
age=sc.nextInt();
if(age<18)
{
throw new AgeNotValidForVaccinationException("you are not eligible to get the  vaccine");
   }
else
{
System.out.println("You are eligible respectfully to get this  vaccine");
}
 }
catch(AgeNotValidForVaccinationException e)
{
System.out.println("Cuaght an exception");
System.out.println(e);
}
}
}
