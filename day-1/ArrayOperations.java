package com.excel;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

			
	public void createArray() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size= scanner.nextInt();
		
		int [] numbers= new int[size];
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]= scanner.nextInt();
		}
		

		}
	
	public  void printArray()
	{
		Scanner scanner= new Scanner(System.in);
		
		int size= scanner.nextInt();
		
		int [] numbers= new int[size];
		
System.out.println("The array is: ");
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
	

	public  void sortArray() 
	{
		int [] arr= {39,55,18,24,95,8};
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public void reverseArray() {
		int[] arr= {1,2,3,4,5,6};
		
		  for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}  
		  
			for(int j=arr.length-1; j>0; j--)
			{
				System.out.println(arr[j]);
			}
	}
	
	public  void mergeArray() {
		int [] num1= {1,2,3};
		int [] num2= {4,5,6};
		
	
	}
	
	
	public void maxElement()
	{
//		int [] arr= {12,20,17,33,7};
//	        int i;
//		int max= arr[0];
//		
//		 for(int i=1; i<arr.length; i++)
//		 {
//	            if(arr[i]>max)
//	            	max = arr[i];
//		} 
	}
	
	public void unionArray()
	{
		int [] num1= {1,2,3};
		int [] num2= {4,5,6};
		
		int [] newArr= new int[num1.length + num2.length ];
		int i=0, j=0, k=0;
		
		while(i<num1.length && j<num2.length)
		{
			if(num1[i] == num2[j])
			{
				newArr[k++]= num1[i++];
				j++;
			}
			else if(num1[i]< num2[j])
			{
				newArr[k++]= num1[i++];
			}
			else
			{
				newArr[k++]= num2[j++];
			}
		}
		while(i<num1.length)
		{
			newArr[k]=num1[i];
		}
		while(j<num2.length)
		{
			newArr[k]=num2[j];
		}
		for(int value: newArr)
		{
			if(value !=0)
				System.out.println(value);
		}
		
	}
	
	public void patterns()
	{
		/*n=5;
		11111
		22222
		33333
		44444
		55555
		*/
		for(int i=1; i<=5; i++)
		{
			for(int j=1;j<=5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
	public void pattern2()
	{
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayOperations ar= new ArrayOperations();
		ar.createArray();
		System.out.println("===========");
		ar.printArray();
		System.out.println("=========");
		ar.sortArray();
		System.out.println("==========");
		ar.reverseArray();
		System.out.println("===========");
		ar.mergeArray();
		System.out.println("===========");
		ar.maxElement();
		System.out.println("-----------");
		ar.unionArray();
		System.out.println("-----PATTERNS----");
		ar.patterns();
	}
	}

