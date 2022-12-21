package multithreading;

public class ThreadDemo extends Thread
{
public void run()
{
	for(int i=1;i<=5;i++)
{
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.println(i); //1 1 2 2
		}
}
	public static void main(String[] args) 
	{
		ThreadDemo t1=new ThreadDemo(); // call stack
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();
		t1.start();
		try
		{
			t1.join(1500);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		// t1.start(); // throw java.lang.IllegalThreadStateException
		t2.start();
		t3.start();
}
}
