package multithreading;

public class DeadlockDemo 
{
public static void main(String[] args) 
{
String resource1="pen";
String resource2="paper";

//thread subhadra lock pen, tries to lock paper

Thread subhadra=new Thread()
{
public void run()
{
synchronized(resource1) 
{
System.out.println("subhadra lock pen");

try {
Thread.sleep(200);

}catch(Exception e)
{}

synchronized (resource2) 
{
System.out.println("subhadra trying to lock paper");
}
}
}
};

//thread kook lock paper, tries to lock pen

Thread palak=new Thread()
{
public void run()
{
synchronized (resource2) {
System.out.println("palak lock paper");

try
{
Thread.sleep(200);

}
catch(Exception e)
{}

synchronized (resource1) 
{
System.out.println("palak trying to lock pen");
}
}
}
};
subhadra.start();
palak.start();


}

}