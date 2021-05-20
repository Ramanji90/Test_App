package com.ram.patterns;

public class Pattern17 {

	public static void main(String[] args) {
		
		for(int i=0; i<=4; i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=4; j>=i; j--)
			{
				if(j==4 || j==i || i==0 && j>=i)
				  System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
