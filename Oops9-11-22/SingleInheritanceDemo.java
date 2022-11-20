package oopsconcept;

class Parent1
{
void parentMethod()
{
System.out.println("this is parent class method");
}
}
class Child1 extends Parent1
{
void childMethod()
{
System.out.println("this is child class method");
}
}

public class SingleInheritanceDemo 
{

public static void main(String[] args) 
{
// TODO Auto-generated method stub
Child1 obj=new Child1();
        obj.parentMethod();
        obj.childMethod();
}

}