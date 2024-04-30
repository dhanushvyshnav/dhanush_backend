package com.excel;

public class Patterns {

	public void pattern1()
	{
		/*n=5;
		1 1 1 1 1
		2 2 2 2 2
		3 3 3 3 3
		4 4 4 4 4
		5 5 5 5 5
		*/
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
	public void pattern2()
	{
		/*n=5;
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		*/
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public void pattern3()
	{
		/* n=5;
		 1
		 2 3
		 3 4 5
		 4 5 6
		 6 7 8 9
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((i+j-1) + " ");
			}
			System.out.println();
		}
	}
	
	public void pattern4()
	{
		/*
		n=5;
		1,1 2,1 3,1 4,1 5,1
		1,2 2,2 3,2 4,2 5,2
		1,3 2,3 3,3 4,3 5,3
		1,4 2,4 3,4 4,4 5,4
		1,5 2,5 3,5 4,5 5,5
		*/	
	}

	
	public static void main(String[] args) {
		Patterns p= new Patterns();
		p.pattern1();
		
		System.out.println("-------------");
		p.pattern2();
		
		System.out.println("--------------");
		p.pattern3();
		
		System.out.println("---------------");
		p.pattern4();
	}

}
