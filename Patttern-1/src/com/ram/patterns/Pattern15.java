package com.ram.patterns;

public class Pattern15 {

	public static void main(String[] args) {
		int n=10;
		int mid=(n+1)/2;
		 for(int i=0; i<=mid-1; i++)
		 {
			 for(int s=mid-1; s>i; s--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0; j<=i*2; j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=0; i<=mid-1; i++)
		 {
			 for(int s=0;s<=i;s++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=mid-2; j>i; j--)
			 {
				 System.out.print("*");
			 }
			 for(int k=mid-1; k>i; k--)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}
