package multithreading;
class Account
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
	System.out.println("going to withdraw the amount "+ amount);
	if(this.amount<amount)
	{
	System.out.println("insufficient balance");
    try
    {
	wait();
    }
catch(Exception e)
{
	
}
	this.amount-=amount; //this.amount=amount-amount
	System.out.println(amount+" withdraw complete");
	System.out.println(amount+" Available balance: " +this.amount);
	
}	
}
		synchronized void deposit(int amount)
		{
			System.out.println(" deposting the amount "+ amount);
			this.amount+=amount; //this.amount=amount+amount
			System.out.println(amount+" depost completed");
			notifyAll();
		}
		synchronized void checkBalance()
		{
			try
			{
				wait();}
			catch (Exception e)
			{
				//TODO: handle exception
	}
			System.out.println(" Available balnce: "+ this.amount);
		}
	}
		public class InterThreadComunnication 
	{

	public static void main(String[] args)
	{
		Account account=new Account();
		new Thread()
		{
			public void run()
			{
				account.withdraw(20000);
			}
		}
		.start();
		new Thread()
		{
			public void run()
			{
			account.checkBalance();	
			}
		}
		.start();
		
		new Thread()
		{
			public void run()
			{
				account.deposit(30000);
			}
		}
		.start();
	}
	}
		