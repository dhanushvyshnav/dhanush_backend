package com.excel;

import java.util.Arrays;

public class StringOperations 
{

	public void isPalindrome()
	{
		//A palindrome is a sequence of characters that reads the same forward and backward. 

		String str="LOL";

		String rev = "";
		for (int i = str.length()-1; i >=0 ; i--) 
			rev=rev+str.charAt(i);
		if(str.equals(rev))
			System.out.println(str + " is a Palindrome");
		else 
			System.out.println(str + " is not a Palindrome");
	}

	public void countEachCharacter()
	{
		String str="Dhanush";
		String completed = "";
		for(int i=0;i<str.length();i++) 
		{
			int count=0; 
			for(int j=i; j<str.length();j++) 
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
					count++;   
				}
			}
			String s = String.valueOf(str.charAt(i));
			if(!completed.contains(s))
			{
				completed=completed+str.charAt(i);
				System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
			}         
		}
	}

	public void isAnagram()
	{
		String a="heart";
		String b="earth";
		
		char[]c=a.toCharArray();
		char []d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c ,d)) 
		{
		System.out.print("angram");
		}
		else 
		{
		System.out.print("not a anagram");
		}
	}

	public void isPanagram()
	{
		String str="Excelsoft";
		int[] freq=new int[26];
		 str= str.toUpperCase();
		 
		 for(int i=1; i<str.length(); i++)
		 {
			 freq[str.charAt(i)-65]++;
		 }
		 for(int i=1; i<freq.length; i++)
		 {
			 if(freq[i]==0)
			 {
				 System.out.println(str + " is a panagram");
			 }
			 else {
				 System.out.println(str + " is not a panagram");
			 }	 
		 }
	}

	public void reverse()
	{
		String str = "Excelsoft";
	    String reversedStr = "";
	    
	    System.out.println("Original string: " +str);
	        
	    for (int i=0; i<str.length(); i++) 
	    {
	      reversedStr=str.charAt(i)+reversedStr;
	    }
	    System.out.println("Reversed string: "+ reversedStr);
	}

	public void countWords() 
	{
		 String words = "Hello team good morning!";
		    int countWords = words.split("\\s").length;
		    System.out.println("the total words are "+countWords);
		  
	}

	public void isAllVowelsPresent()
	{
		
	}

	public void countVowels()
	{
		String s = "Excelsoft";
		int count = 0;
		for(int i=0;i<s.length();i++) 
		{
		char c= s.charAt(i); c=Character.toUpperCase(c);
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
		{
		count++;
		}
		}
		System.out.println("No.of Vowels: "+count);	
		}


	public static void main(String[] args) 
	{

		StringOperations so= new StringOperations();

		so.isPalindrome();

		System.out.println("-------------------");
		so.countEachCharacter();

		System.out.println("-------------------");
		so.isAnagram();

		System.out.println("-------------------");
		so.isPanagram();

		System.out.println("------------------");
		so.reverse();

		System.out.println("---------------------");
		so.countWords();

		System.out.println("-------------------");
		so.isAllVowelsPresent();

		System.out.println("----------------");
		so.countVowels();
	}


}
