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
		1,1 2,1 3,1 4,1 5,1
		1,2 2,2 3,2 4,2 5,2
		1,3 2,3 3,3 4,3 5,3
		1,4 2,4 3,4 4,4 5,4
		1,5 2,5 3,5 4,5 5,5
		 */	
		for(int i=1;i<=5;i++) 
		{	
			for(int j=1;j<=5;j++) 
			{
				System.out.print(j+","+i+" ");	
			}
			System.out.println();
		}
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
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<i*2-1; j++)
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
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				System.out.print("  ");	
			}
			for(int j=0; j<i*2-1; j++)
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
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<i*2-1; j++)
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
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			for (int j=i-1; j>=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pattern24()
	{
		/*
		 1
		 2 6
		 3 7 10
		 4 8 11 13
		 5 9 12 14 15
		 */
		for (int i = 1; i<=5; i++) {
			int num=i;
			for (int j=1; j<=i; j++) {
				System.out.print(num + " ");
				num += (5-j);
			}
			System.out.println();
		}
	}

	public void pattern25()
	{
		/**
		   1
		 2 1 2
	   3 2 1 2 3
	 4 3 2 1 2 3 4
   5 4 3 2 1 2 3 4 5
		 */

		for (int i = 1; i <=5; i++) {
			for (int j = i; j < 5; j++) 
			{
				System.out.print("  ");
			}
			for (int j = i; j >= 2; j--) 
			{
				System.out.print(j + " ");
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void pattern26()
	{
		/**
	    	 5
		   4 5 4
		 3 4 5 4 3
	   2 3 4 5 4 3 2
	 1 2 3 4 5 4 3 2 1
		 */
		for (int i = 0; i < 5; i++) {
			for (int j=0; j<2*(5-i-1); j++) 
			{
				System.out.print(" ");
			}
			for (int j=5-i; j<=5; j++) 
			{
				System.out.print(j + " ");
			}
			for (int j=5-1; j>5-i-1; j--) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void pattern27()
	{
		/**
		          A
		        A B A
		      A B C B A
		    A B C D C B A
		  A B C D E D C B A
		 */

		for (int i=0; i <5; i++) 
		{
			for (int j=0; j<5-i-1; j++) 
			{
				System.out.print("  ");
			}
			for (int j=0; j<=i; j++) 
			{
				System.out.print((char)('A' + j));
				if (j<i) 
				{
					System.out.print(" ");
				}
			}
			for (int j=i-1; j>=0; j--) 
			{
				System.out.print(" " + (char)('A' + j));
			}
			System.out.println();
		}

	}

	public void pattern28()
	{
		/**
             A
           B A B
         C B A B C
       D C B A B C D
     E D C B A B C D E
		 */

		for (int i=0; i <5; i++) 
		{
			for (int j=0; j<5-i-1; j++) 
			{
				System.out.print("  ");
			}
			for (int j=i; j>=0; j--) 
			{
				System.out.print((char)('A' + j));
				if (j>0) 
				{
					System.out.print(" ");
				}
			}
			for (int j=1; j<=i; j++) 
			{
				System.out.print(" " +(char)('A' + j));
			}
			System.out.println();
		}

	}

	public void pattern29()
	{
		/**
		 1 2 3 4 5 4 3 2 1
		   1 2 3 4 3 2 1
		     1 2 3 2 1
		       1 2 1
		         1
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for (int k=1; k<=5-i+1; k++) {
				System.out.print(k + " ");
			}
			for (int j=5-i; j>=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pattern30()
	{
		/**
	   5 4 3 2 1 4 3 2 1
		 4 3 2 1 3 2 1
		   3 2 1 2 1
		     2 1 2
		       1
		 */

		for (int i=0; i<5; i++) {
			for (int j=0; j< i; j++) 
			{
				System.out.print("  ");
			}
			for (int j=5-i; j>=1; j--) 
			{
				System.out.print(j + " ");
			}
			for (int j=2; j<=5-i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public void pattern31()
	{
		/**
		     1
		   1 * 2
		 1 * 2 * 3
	   1 * 2 * 3 * 4
	 1 * 2 * 3 * 4 * 5
		 */

		for (int i=1; i<=5; i++) 
		{
			for (int j=1; j<=5-i; j++) 
			{
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++) 
			{
				if (j<i) 
				{
					System.out.print(j + " * ");
				} 
				else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

	public void pattern32()
	{
		/**

		 *
		 * * *
		 * * * * * 
		 * * * * * * *
		 * * * * * 
		 * * *
		 * 

		 */
		int n=7;
		int x=n/2+1;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if((j>=x)!=false && j<=n-x+1)
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<=n/2)
			{
				x--;
			}
			else {
				x++;
			}
			System.out.println();
		}
	}

	public void pattern33()
	{
		/**

		 * * * * * * * 
		 * * * * * 
		 * * * 
		 * 
		 * * * 
		 * * * * * 
		 * * * * * * * 

		 */
		int n=7;
		int sp=0,st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
				sp++;
				st=st-2;
			}
			else {
				sp--;
				st=st+2;
			}
			System.out.println();
		}
	}

	public void pattern34()
	{
		/**
   1 2 3 4 3 2 1 
     1 2 3 2 1 
       1 2 1 
         1 
       1 2 1 
     1 2 3 2 1 
   1 2 3 4 3 2 1 
		 */
		int n=7;
		int k,st=n,sp=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			k=1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(k+" ");
				if(j<=st/2)
					k++;
				else
					k--;
			}
			if(i<=n/2)
			{
				st=st-2;
				sp++;
			}
			else
			{
				st=st+2;
				sp--;
			}
			System.out.println();
		}
	}

	public void pattern35()
	{
		/**
		 1 2 3 4 3 2 1
		   2 3 4 3 2
		     3 4 3 
		       4
		     3 4 3
		   2 3 4 3 2
		 1 2 3 4 3 2 1
		 */
		int n=7;
		int sp=0,st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			int x=sp+1;
			for(int k=1;k<=st;k++) {
				System.out.print(x+" ");
				if(k<=st/2)
					x++;
				else
					x--;
			}
			if(i<=n/2) {
				sp++;
				st=st-2;
			}
			else {
				sp--;
				st=st+2;
			}
			System.out.println();
		}
	}

	public void pattern36()
	{
		/**
		4 3 2 1 2 3 4 
		  3 2 1 2 3 
		    2 1 2 
		      1 
		    2 1 2 
		  3 2 1 2 3 
		4 3 2 1 2 3 4 
		 */
		int n=7;
		int sp=0,st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) 
			{	
				System.out.print("  ");
			}
			int x=st/2+1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(x+" ");
				if(j<=st/2)
					x--;
				else
					x++;
			}
			if(i<=n/2)
			{
				sp++;
				st=st-2;
			}
			else {
				sp--;
				st=st+2;
			}

			System.out.println();
		}
	}

	public void pattern37()
	{
		/**
	 	        1 
		      2 1 2 
		    3 2 1 2 3 
		  4 3 2 1 2 3 4 
		    3 2 1 2 3 
		      2 1 2 
		        1
		 */
		int n=7;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) 
			{	
				System.out.print("  ");
			}
			int x=st/2+1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(x+" ");
				if(j<=st/2)
					x--;
				else
					x++;
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}

			System.out.println();
		}
	}

	public void pattern38()
	{
		/**
           1 
	     1 2 1 
	   1 2 3 2 1 
     1 2 3 4 3 2 1 
	   1 2 3 2 1 
	     1 2 1 
	       1 
		 */
		int n=7;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) 
			{	
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(x+" ");
				if(j<=st/2)
					x++;
				else
					x--;
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}

			System.out.println();
		}
	}

	public void pattern39()
	{
		/**
		 *
		 *   * 
		 *       * 
		 *           * 
		 *       * 
		 *   * 
		 * 
		 */
		int n=7;
		int px=n/2+1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j==px || j==n-px+1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<=n/2)
				px--;
			else
				px++;
			System.out.println();
		}
	}

	public void pattern40()
	{
		/**
		 * * * * * * *
		 * *       * *
		 *   *   *   *
		 *     *     *
		 *   *   *   *
		 * *       * *
		 * * * * * * *
		 */
		int n=7;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 || j==0 || i==j || i==n-1 || j==n-1 || i+j==n-1 )
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void pattern41()
	{
		int n=7;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(j==1||j==n||i==1||i==n/2+1||j==n/2+1||i==n)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}}

			System.out.println();
		}
	}

	public void pattern42()
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

		System.out.println("------------------");
		p.pattern23();

		System.out.println("------------------");
		p.pattern24();

		System.out.println("------------------");
		p.pattern25();

		System.out.println("------------------");
		p.pattern26();

		System.out.println("------------------");
		p.pattern27();

		System.out.println("------------------");
		p.pattern28();

		System.out.println("------------------");
		p.pattern29();

		System.out.println("------------------");
		p.pattern30();

		System.out.println("------------------");
		p.pattern31();

		System.out.println("------------------");
		p.pattern32();

		System.out.println("------------------");
		p.pattern33();

		System.out.println("------------------");
		p.pattern34();

		System.out.println("------------------");
		p.pattern35();

		System.out.println("------------------");
		p.pattern36();

		System.out.println("------------------");
		p.pattern37();

		System.out.println("------------------");
		p.pattern38();

		System.out.println("------------------");
		p.pattern39();

		System.out.println("------------------");
		p.pattern40();

		System.out.println("------------------");
		p.pattern41();

	}

}
