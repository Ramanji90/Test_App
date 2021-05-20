package com.ram.primenumber;

public class FindPrimeNumber 
{
	
	public static String findPrimeNumber(int n){
		
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				flag=true;
			}
		}
		
		if(flag)
		{
			return "The given number "+n + " is not a Prime number";
		}
		else
		{
			return "The given number "+n + " is a Prime number";
		}
	}
	public static void main(String[] args)
	{
		int n=10;
		
		for(int i=0; i<=n; i++)
		{
			System.out.println(findPrimeNumber(i));
		}
		
		
	}

}
