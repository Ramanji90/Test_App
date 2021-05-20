package com.ram.sort_array;

public class SortingArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,3,1,8,2,6,4};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
				{
				   if(arr[i] > arr[j]) 
				   {
					   int temp = arr[j];
					   arr[j] = arr[i];
					   arr[i] = temp;
				   }
			    }
				   
		}
		
		for(int ele: arr)
		{
			System.out.println(ele +" ");
		}
		
				

	}

}
