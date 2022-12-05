package arrayExamples;

public class JaggedArray
{

	public static void main(String[] args) 
	{
		int arr[][]=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		
		int num=1;
		//initializing a jagged array 
		for(int i=0;i<arr.length;i++)//arr.length will return length of row 
		{
			for(int j=0;j<arr[i].length;j++)//arr.length will return length of column 
			{
				arr[i][j]=num++;
				//num++;
			}
		}
		//printing the data of a jagged array
		for(int i=0;i<arr.length;i++)//arr.length will return length of row 	
		{
			for(int j=0;j<arr[i].length;j++)//arr.length will return length of column 
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();//new line
		}

}
}
