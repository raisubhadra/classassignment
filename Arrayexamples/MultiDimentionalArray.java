package arrayExamples;

import java.util.Scanner;

public class MultiDimentionalArray
{
	public static void main(String[] args) 
	{
	int arr[][],i,j,row,col;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row: ");
	row=sc.nextInt();
	
	System.out.println("enter column: ");
	col=sc.nextInt();
	
	arr=new int [row][col];
	
	System.out.println("enter elements in "+row+"x"+col+"matrix");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	//print
	System.out.println("elements are: ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)	
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}

	
	

	
