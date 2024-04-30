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
		System.out.println("the elements are: ");

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

		System.out.println("reverse array is: ");
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
	public void zigzagmergeArray()
	{
		  int[] arr1 = {1, 2, 3, 4};
	        int[] arr2 = {5, 6, 7, 8};
	        int m1 = arr1.length;
	        int m2 = arr2.length;
	        int[] res = new int[m1 + m2];
	        System.out.println("Zigzag Merged Array is: ");

	        for (int i = 0; i < m1; i++) {
	            res[i] = arr1[i];
	        }
	        for (int j = 0; j < m2; j++) {
	            res[m1 + j] = arr2[j];
	        }

	    
	        int i = 0;
	        int j = res.length - 1;
	        while (i <= j) {
	            System.out.print(res[i] + " ");
	            i++;
	            if (i <= j) {
	                System.out.print(res[j] + " ");
	                j--;
	            }
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
		System.out.println(" The union of array is: ");
		
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
				System.out.print(value + " ");
		}

	}
	public void removeDuplicates()
	{
		int [] arr= {2,3,5,1,9,2,4,7,3,9};
		
		int[] temp = new int[arr.length];
		System.out.println(" Elements after removed ");
		 int j = 0;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] != arr[i+1]) {
	                temp[j++] = arr[i];
	            }
	        }
	        temp[j++] = arr[arr.length - 1];
	        
	        for (int i = 0; i<j; i++) {
	             arr[i] = temp[i];
	        }

	        for (int i = 0; i < j; i++) {
	             System.out.print(temp[i]);
	        }
	}
	
	public void duplicateElements()
	{
		int [] arr= {2,3,5,1,9,2,4,7,3,9};
		System.out.println(" the duplicated elements are: ");
		  for(int i=0;i<arr.length-1;i++)
	        {
	            for(int j=i+1; j<arr.length;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                    System.out.print(arr[i] +" ");
	                }
	            }
	        }
	}

	public void numberOfOccurance()
	{
		int[] arr = {1,2,3,4,2,5,3,6,5};
		
		 Arrays.sort(arr);
	        int current = arr[0];
	        int count = 1;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == current) {
	                count++;
	            } else {
	                System.out.println("Total occurrences of " + current + ": " + count);
	                current = arr[i];
	                count = 1;
	            }
	        }
	        System.out.println("Total occurrences of " + current + ": " + count);
	}
	
	public void countPrime()
	{
		int[] arr = {2,4,3,5,6,9,11,12};
		for(int i=0; i<arr.length; i++){
	        boolean isPrime = true;
	        
	        for (int j=2; j<arr[i]; j++){
	            
	            if(arr[i]%j==0){
	                isPrime = false;
	                break;
	            }
	        }
	        if(isPrime)

	            System.out.println(arr[i] + " is the prime number in array ");
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
		System.out.println('\n');
		
		System.out.println("--------------");
		ar.zigzagmergeArray();
		System.out.println('\n');
		
		System.out.println("-----------");
		ar.maxElement();
		System.out.println("------------------------");
		ar.minElement();
		
		System.out.println("-----------");
		ar.unionArray();
		System.out.println('\n');
		
		System.out.println("----------------------");
		ar.removeDuplicates();
		System.out.println('\n');
		
		System.out.println("------------");
		ar.duplicateElements();
		System.out.println('\n');
		
		System.out.println("------------------");
		ar.numberOfOccurance();
		
		System.out.println("------------------");
		ar.countPrime();
	}
	}

