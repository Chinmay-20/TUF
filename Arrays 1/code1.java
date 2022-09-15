import java.util.*;

class code1
{
	public static int checkzero(int arr[][])
	{
		int pos=0;
		boolean flag=false;
		
		for(int index=0;index<arr.length;index++)
		{
			for(int index2=0;index2<arr[index].length;index2++)
			{
				if(arr[index][index2]==0)
				{
					pos=index2;
					flag=true;
					break;
				}
			}
			if(flag==true)
				break;
		}
		return pos;
	}
	
	public static int[][] makezero(int arr[][],int pos)
	{
		for(int index=0;index<arr.length;index++)
		{
			for(int index2=0;index2<arr[index].length;index2++)
			{	
				if(index2==pos || index==pos)
				{
					arr[index][index2]=0;
				}
			}
		}
		return arr;
	}
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int arr[][]=new int[3][4];
		
		for(int index=0;index<arr.length;index++)
		{
			for(int index2=0;index2<arr[index].length;index2++)
			{
				arr[index][index2]=sobj.nextInt();
			}
		}
		
		int pos=checkzero(arr);
		arr=makezero(arr,pos);
		for(int index=0;index<arr.length;index++)
		{
			for(int index2=0;index2<arr[index].length;index2++)
			{
				System.out.print(arr[index][index2]+" ");
			}
			System.out.println();
		}
	}
}
