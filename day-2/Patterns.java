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


	public void pattern5()
	{
		/* n=5;
		 1 0 1 0 1
		 1 0 1 0 1
		 1 0 1 0 1
		 1 0 1 0 1
		 1 0 1 0 1
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print((j%2) + " ");
			}
			System.out.println();
		}
	}

	public void pattern6()
	{
		/*
		 a a a a a
		 b b b b b
		 c c c c c
		 d d d d d
		 e e e e e
		 */
		char i;
		char j;
		for( i='a'; i<='e'; i++)
		{
			for( j='a'; j<='e'; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void pattern7()
	{
		/*
		 A B C D E
		 A B C D E
		 A B C D E
		 A B C D E
		 A B C D E
		 */

		char i;
		char j;
		for(i='A'; i<='E'; i++)
		{
			for(j='A'; j<='E'; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

	public void pattern8()
	{
		/*
		 5 4 3 2 1
		 5 4 3 2 1
		 5 4 3 2 1
		 5 4 3 2 1
		 5 4 3 2 1
		 */
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

	public void pattern9()
	{
		/*  
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public void pattern10()
	{
		/*
		 * * * * *
		 * * * *
		 * * * 
		 * *
		 * 
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public void pattern11()
	{
		/*
		 1 2 3 4 5
		 1 2 3 4 
		 1 2 3
		 1 2
		 1
		 */
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	public void pattern12()
	{
		/*
		 5 4 3 2 1
		 4 3 2 1 
		 3 2 1
		 2 1
		 1
		 */
		for(int i=1; i<=51; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

	public void pattern13()
	{
		/* 
		 5 5 5 5 5
		 4 4 4 4
		 3 3 3 
		 2 2 
		 1
		 */
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

	public void pattern14()
	{
		/*
		 1 2 3 4 5
		 2 3 4 5
		 3 4 5
		 4 5
		 5
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

	public void pattern15()
	{
		/*
		 1
		 2 1
		 3 2 1
		 4 3 2 1
		 5 4 3 2 1
		 */
		
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pattern16()
	{
		/*
		 5
		 5 4
		 5 4 3
		 5 4 3 2
		 5 4 3 2 1
		 */
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

	public void pattern17()
	{
		/*
		 1
		 2 2
		 3 3 3 
		 4 4 4 4
		 5 5 5 5 5
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void pattern18()
	{
		/*
		 1 1 1 1 1
		 2 2 2 2
		 3 3 3
		 4 4
		 5
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void pattern19()
	{
	/*
		  *
	    * *
   	  * * *
    * * * * 
  * * * * *
	 */
		for(int i=1; i<=5; i++)
		{
			for(int j=5-1; j>=i; j--)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void pattern20()
	{
	/*
		  * 
	    * * *
	  * * * * *
    * * * * * * * 
  * * * * * * * * *

		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<5-i; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i*2-1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern21()
	{
		/*
		 1
	   O 0 0
	 1 1 1 1 1
   0 0 0 0 0 0 0
 1 1 1 1 1 1 1 1 1
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<5-i; j++)
			{
				
				
					System.out.print("  ");
				
			}
			for(int j=1; j<=i*2-1; j++)
			{
				if(i%2==0)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
	}

	public void pattern22()
	{
		/*
		   1
		 1 0 1
	   1 0 1 0 1
	 1 0 1 0 1 0 1
   1 0 1 0 1 0 1 0 1
   
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<5-i; j++)
			{
					System.out.print("  ");
			}
			for(int j=1; j<=i*2-1; j++)
			{
				if(j%2==0)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public void pattern23()
	{
		/*
		   1
		 1 2 3
	   1 2 3 4 5
	 1 2 3 4 5 6 7 
   1 2 3 4 5 6 7 8 9
		 */
	}
	
	public void pattern24()
	{
		
	}
	
	public void pattern25()
	{
		
	}
	
	public void pattern26()
	{
		
	}
	
	public void pattern27()
	{
		
	}
	
	public void pattern28()
	{
		
	}
	
	public void pattern29()
	{
		
	}
	
	public void pattern30()
	{
		
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

		System.out.println("-----------------");
		p.pattern5();

		System.out.println("------------------");
		p.pattern6();


		System.out.println("------------------");
		p.pattern7();


		System.out.println("------------------");
		p.pattern8();


		System.out.println("------------------");
		p.pattern9();


		System.out.println("------------------");
		p.pattern10();


		System.out.println("------------------");
		p.pattern11();


		System.out.println("------------------");
		p.pattern12();

		System.out.println("-----------------");
		p.pattern13();

		System.out.println("------------------");
		p.pattern14();

		System.out.println("-----------------");
		p.pattern15();

		System.out.println("--------------------");
		p.pattern16();

		System.out.println("------------------");
		p.pattern17();

		System.out.println("----------------------");
		p.pattern18();

		System.out.println("--------------------");
		p.pattern19();

		System.out.println("-----------------");
		p.pattern20();
		
		System.out.println("----------------");
		p.pattern21();
		
		System.out.println("------------------");
		p.pattern22();
	}

}
