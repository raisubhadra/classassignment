package oopsconcept;

class Personn
{
  int id;
  String name,address;
 
   public Personn(int id,String name,String address)
  {
  this.id=id;
  this.name=name;
  this.address=address;
  }
   void display()
   {
  System.out.println("Id: "+id);
  System.out.println("Name: "+name);
  System.out.println("Address: "+address);
   }
}

class StudentDetailss extends Personn
{
  float marks;
  public StudentDetailss(int id,String name,String address,float marks)
  {
    //this.id=id;               we're not going to call these 3 lines,we'll just type
    //this.name=name;                
    //this.address=address;  
 super(id,name,address);            //and this line will be same
      this.marks=marks;
   }
   void getData()
   {
  super.display();
  System.out.println("marks: "+marks);
   }
}

 public class SingleInheritanceDemo2 
{

  public static void main(String[] args) 
{
// TODO Auto-generated method stub
StudentDetailss obj=new StudentDetailss(1,"subhadra","gurugram",80.0f);   
  //obj.display();
  obj.getData();     // now we'lldo void display method and get one too
}

}