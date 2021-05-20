package com.ram.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int n=65;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(n++ + 32));
			}
			System.out.println();
		}

	}

}
