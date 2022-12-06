package arrayExamples;

import java .util.Scanner;

public class DiagonalElementsMatrix 
{
	  private static int DiagonalSum(int[][] a)
		 {
		 int sum =0;
		 for(int i=0;i<a.length;i++)
		 {
		 for(int j=0;j<a[0].length;j++)
		 {
		 //Check for main diagonal element
		 if(i==j)
		 {
		 sum=sum+a[i][j];
		 }
		 }
		 }
		 return sum;
		 }

		 public static void main(String[] args) 
		 {
		 int arr[][],i,j,row,col;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter row:");
		 row=sc.nextInt();
		        
		 System.out.println("Enter column:");
		 col=sc.nextInt();
		        
		 arr=new int[row][col];
		        
		 System.out.println("Enter elements in "+row+" x "+col+" matrix ");
		        
		 for(i=0;i<row;i++)
	{
		 for(j=0;j<col;j++)
    {
		 arr[i][j]=sc.nextInt();
	}
    }
		 System.out.println("Diagonal sum is "+DiagonalSum(arr));
		 }

		 }