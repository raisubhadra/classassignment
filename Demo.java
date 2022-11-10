package oopsconcept;

import java.util.Scanner;

class Student
{
int id;
String name,address,course;
float fees;

void setData(int i,String n,String add,String c,float f)//parameter are local variable
{
this.id=i;
this.name=n;
this.address=add;
this.course=c;
this.fees=f;
//System.out.println("This keyword: "+this);
//this.displayData();
displayData(); //compiler automatically add this ex. this.displayData();
}

void displayData()
{
System.out.println("id: "+id);
System.out.println("name: "+name);
System.out.println("address: "+address);
System.out.println("course: "+course);
System.out.println("fees: "+fees);
}

}//end of class
public class Demo {
   
public static void main(String[] args) 
{
        int id,n;
        String name,address,course;
        float fees;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of student you want to enter:");
        n=sc.nextInt();
       
        for(int i=1;i<=n;i++)
        {
        System.out.println("=================================");
        System.out.println("Enter id:");
        id=sc.nextInt();
       
        sc.nextLine(); //it will consume the delimeter(enter)
       
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter address:");
        address=sc.nextLine();
        System.out.println("Enter course:");
        course=sc.nextLine();
        System.out.println("Enter fees:");
        fees=sc.nextFloat();
        //anonymous object creation
        new Student().setData(id,name,address,course,fees);
       // System.out.println("obj object: "+obj);
        System.out.println("=================================");
        //obj.displayData();
       
        }
     }
}

/*
 * assigning values to instance variables
 * 1.using instance or object (not secure)
 * 2.using method(secure) can add more security using access specifier
 * 3.using constructor(secure)
 */