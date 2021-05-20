package com.ram.patterns;

public class Pattern16 {

	public static void main(String[] args) {
		
		for(int i=0; i<=4; i++)
		{
			for(int s=4;s>i;s--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++)
			{
				if(j==0 || j==i || i==4 && j<=4)
				{
				  System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
