package arrayExamples;

import java.util.Scanner;

class Account
{
    int accNo;
    String accHolderName;
    double amount;
    public Account(int accNo,String accHolderName,double amount)
    {
        super();
        this.accNo=accNo;
        this.accHolderName=accHolderName;
        this.amount=amount;
    }
    public void statement()
    {
    	System.out.println("Account Number: "+accNo+"\nAccount Holder Name: "+accHolderName+"\nAccount Balance: "+amount);
    }
}

public class ArrayOfObject
{

    public static void main(String[] args) 
    {
        
        int accId;
        String holderName;
        double amount;
        Scanner sc = new Scanner(System.in);
        //creating array of Account object
        Account bank[] = new Account[3];

        //bank[0]=new Account(34567,"subhadra",30000);
        
        //adding values 
        System.out.println("-----------Enter account details-----------");
        for(int i=0;i<bank.length;i++)
        {
        System.out.println("enter account no: ");
        accId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Holder Name: ");
        holderName = sc.nextLine();
        System.out.println("Enter Account Balance: ");
        amount = sc.nextDouble();
        bank[i] = new Account(accId, holderName, amount);
        System.out.println("===============================");

    }
//prin t details
	for(int i=0;i<bank.length;i++)
	{
		bank[i].statement();
		System.out.println("===============================");
		
	}
}
}




