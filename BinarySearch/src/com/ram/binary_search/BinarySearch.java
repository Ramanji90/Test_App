package com.ram.binary_search;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		
		int mid = arr.length/2;
		
		int ele=7;
		
		if(ele < arr[mid])
		{
			for(int i=0; i<mid; i++)
			{
				if(ele == arr[i])
				{
					System.out.println("Element found at "+ i + " index");
				}
			}
		}
		else if(ele > arr[mid])
		{
			for(int i=mid+1; i<arr.length; i++)
			{
				if(ele == arr[i])
				{
					System.out.println("Element found at "+ i + " index");
				}
			}
		}
		else
		{
			System.out.println("Element found at "+ mid + " index");
		}

	}

}
