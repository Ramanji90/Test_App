package com.ram.revers_each_word;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String s = "Hello how are you";
		char[] cArr = s.toCharArray();
		s="";
		
		for(int i=0; i<cArr.length; i++)
		{
			int first=i;
			while(i<cArr.length && cArr[i] != ' ')
			{
				 i=i+1;
			}
			int last = i;
			for(int k=last-1; k>=first; k--)
			{
				s=s+cArr[k];
			}
			if(i < cArr.length)
				s=s+cArr[i];
			
		}
		System.out.println(s);
	}
}
