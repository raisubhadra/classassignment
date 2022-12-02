package arrayExamples;
import java.util.Scanner;

public class InsertInSpecificPosition
{
	static Scanner sc=new Scanner(System.in);
	
	public static int[] setArray(int size)
	{
		int arr[]=new int[10];
		int i,num;
		System.out.println("Enter "+size+" elements in an array ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void insertInSpecificPosition(int arr[],int size)
	{
		int i;
		System.out.println("\nEnter position:");
		int pos=sc.nextInt();
		//checking position for insertion are correct or not
		if(pos>size||pos<0||pos==size)
		{
			System.out.println("\nplease choose position according to size ");
		
		}
		else
		{
			System.out.println("\n enter value to insert");
			int num=sc.nextInt();
			//shifting elements
			for(i=size;i>=pos;i--)
			{
				arr[i]=arr[i-1];
			}
			//inserting elements in postion
			arr[pos-1]=num;
			size++;//increasing the size
			getArray(arr,size);
		}
	}
public static void getArray(int arr[],int size)
{
	for(int i=0;i<size;i++)
	{
		System.out.printf("%3d",arr[i]);
		//System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) 
	{
		int size,arr[];
		System.out.println(" Enter how many elements you want in an array");
		size=sc.nextInt();
		arr=setArray(size);
		getArray(arr,size);
		insertInSpecificPosition(arr,size);

	}

}
