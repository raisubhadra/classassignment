package multithreading;

public class Test extends Thread
{
	public void run()
	{
		System.out.println("thread is running!! "+Thread.currentThread().getName());
	}
public static void main(String[] args) 
	{
	Test t1=new Test(); //new state
	t1.start(); //runnable state 
	
     Test t2=new Test();
     t2.start();
	}

}
