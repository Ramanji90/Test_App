package com.ram.linear_search;

public class LinearSearch 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {1,2,3,4,5,6,7};
		int ele = 8;
		for(int i=0; i<arr.length; i++)
		{
			if(ele == arr[i])
			{
				System.out.println("Element found at "+ i + " index");
			}
			
		}
	}

}
