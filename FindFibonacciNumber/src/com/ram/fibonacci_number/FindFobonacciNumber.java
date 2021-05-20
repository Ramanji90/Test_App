package com.ram.fibonacci_number;

public class FindFobonacciNumber {

	public static void main(String[] args) {
		
		int n=10;
		
		
		int a=0;
		System.out.print(a+" ");
		int b=1;
		System.out.print(b+" ");
		
		for(int i=1; i<n-1;i++)
		{
			 int c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
		}
		

	}

}
