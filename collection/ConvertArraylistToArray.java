package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ConvertArraylistToArray
{

public static void main(String[] args) 
{

List<String> list=new ArrayList<String>();
list.add("ab");
list.add("cd");
list.add("ef");
list.add("gh");

//convert arrayList to array

String[] arr=list.toArray(new String[(list.size())]);
for(String s:arr)
{
System.out.println(s);
}

//traverse arrayList in reverse order
System.out.println("Traversing the arrayList in reverse order");
ListIterator<String> listItr=list.listIterator(list.size());
while(listItr.hasPrevious())
{
System.out.println(listItr.previous());
}

}

}