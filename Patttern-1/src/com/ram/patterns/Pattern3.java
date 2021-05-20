package com.ram.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// Upper Triangle
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Lower Triangle
		
		for(int i=0; i<=4; i++)
		{
			for(int j=4; j>i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
