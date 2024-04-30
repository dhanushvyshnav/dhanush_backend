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
		System.out.println("the ele are:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

	public  void printArray()
	{
		int[] arr={1,2,4,5};
		System.out.println("enter the array elements:");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	public  void sortArray() 
	{
		int [] arr= {39,55,18,24,95,8};

		Arrays.sort(arr);
		System.out.println("Sorted arrays is: ");
		for (int i=0; i<arr.length-1; i++) 
		{
			System.out.println(arr[i]);
		}
	}


	public void reverseArray() {
		int[] arr= {1,2,3,4,5,6};

		System.out.println("reversed array is:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}


	public  void mergeArray() {
		int [] num1= {1,2,3,4};
		int [] num2= {5,6,7};

		int[] arr3=new int[num1.length + num2.length];
		int k=0;
		System.out.println("Merged array is: ");

		for(int i=0;i<num1.length;i++) {
			arr3[k]=num1[i];
			k++;
		}
		for(int i=0;i<num2.length;i++) {
			arr3[k]=num2[i];
			k++;
		}


		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]);	
		}
	}


	public void maxElement()
	{
		int [] arr= {12,20,17,33,7};
		int max = arr[0];  
		for (int i = 0; i < arr.length; i++) {  
			if(arr[i] > max)  
				max = arr[i];
		}
		System.out.println(" The maximum element is : " + max);  
	}
	public void minElement()
	{
		int [] arr= {12,20,17,33,7};
		int min= arr[0];
		for (int i = 0; i < arr.length; i++) {  
			if(arr[i] < min)  
				min = arr[i];
		}
		System.out.println(" The minimum element is : " + min);  

	}

	public void unionArray()
	{
		int [] num1= {1,2,3};
		int [] num2= {4,5,6};

		int [] newArr= new int[num1.length + num2.length ];
		int i=0, j=0, k=0;

		while(i<num1.length && j<num2.length)
		{
			if(num1[i] < num2[j])
			{
				newArr[k++]= num1[i++];

			}
			else if(num1[i]> num2[j])
			{
				newArr[k++]= num2[j++];
			}
			else
			{
				newArr[k++]= num2[i++];
				j++;
			}
		}
		while(i<num1.length)
		{
			newArr[k++]=num1[i++];
		}
		while(j<num2.length)
		{
			newArr[k++]=num2[j++];
		}
		for(int value: newArr)
		{
			if(value !=0)
				System.out.println(value);
		}

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
		System.out.println("-----------");
		ar.maxElement();
		System.out.println("------------------------");
		ar.minElement();
		System.out.println("-----------");
		ar.unionArray();

	}	}

