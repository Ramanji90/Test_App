package com.ram.matrix_display;

import java.util.Scanner;

public class MatrixDisplay {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of rows  ");
		int m = sc.nextInt();
		System.out.println("enter no of columns  ");
		int n = sc.nextInt();
		int [][] arr = new int [m][n];
		System.out.println("Enter M * N elements");
		for(int i=0; i<m ; i++)
		{
			for(int j=0; j<n;j++)
			{
			   arr[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0; i<m; i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<arr.length && j<arr[i].length)
				{ 
					System.out.print(arr[i][j]+" ");
				
				}
			}
			System.out.println();
		}
    
	}

}
