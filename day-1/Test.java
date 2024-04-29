package com.excel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	 
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size= scanner.nextInt();
		
		int [] numbers= new int[size];
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]= scanner.nextInt();
		}
		
		System.out.println("The array is: ");
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		

	}

}
