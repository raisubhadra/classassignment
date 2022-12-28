package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo 
{

public static void main(String[] args) 
{

LinkedList<String> lList=new LinkedList<String>();
lList.add("apple");
lList.add("maango");
lList.add("pineapple");
lList.add("watermelon");

System.out.println(lList);

lList.addFirst("banana");;
lList.addLast("muskmelon");
lList.add(3, "orange");
System.out.println(lList);

System.out.println("traverse linkedList using iterator");
Iterator itr=lList.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

String removed=lList.removeFirst();
System.out.println("removed element: "+ removed);
System.out.println(lList);

String last=lList.removeLast();
System.out.println("removed element: "+ last);
System.out.println(lList);

lList.remove(1);
lList.remove("orange");
System.out.println(lList);

}

}