package oopsconcept;

class Bank
{
int rateOfInterest()
{
return 8;
}
}
class Sbi extends Bank
{
 int rateOfInterest()   //overridden method
{
 return 7;
}
}
 class Axis extends Bank
{
 int rateOfInterest()
{
 return 5;
}
}

public class HierarchialInheritanceDemo {

public static void main(String[] args) {

        Sbi sbi=new Sbi();
        System.out.println("rate of interest: "+ sbi.rateOfInterest()+" %");  
       
        Axis axis=new Axis();
        System.out.println("rate of interest: "+ axis.rateOfInterest()+" %");
}

}
