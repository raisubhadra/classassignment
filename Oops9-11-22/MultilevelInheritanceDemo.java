package oopsconcept;

class Person   //grandparent
{
int id;
String name,address;

public Person(int id,String name,String address)
{
super();
this.id=id;
this.name=name;
this.address=address;
}
public Person()
{
super();
}
void display()
{
System.out.println("Id: "+id);
System.out.println("Name: "+name);
System.out.println("Address: "+address);
}
}

class StudentDetails extends Person  //parent
{
float marks;
public StudentDetails(int id,String name,String address,float marks)
{
super(id,name,address);
this.marks=marks;
}
void display()
{
//float marks=56.7f;
super.display();
//System.out.println("local variable marks: "+marks); //56.7
System.out.println("marks: "+this.marks); //80.0
//System.out.println("Person marks: "+super.marks);  //80.0
}
}
 class child extends StudentDetails  //child
 {
 long phno;
 public child(int id,String name,String address,float marks,long phno)
{
 super(id,name,address,marks);
 this.phno=phno;
}
 void display()
{
   super.display();
   System.out.println("phone number: "+phno);
}
 }


  public class MultilevelInheritanceDemo 
  {

   public static void main(String[] args)
 {

        child obj=new child(1,"kisa","delhi",80.0f,9083463375l);
        obj.display();
        //obj.getData();
 }
}