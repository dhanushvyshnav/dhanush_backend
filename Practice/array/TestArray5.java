package practice;

public class TestArray5 
{
	//Java Program to return an array from the method
	static int[] get()
	{  
		return new int[]{1,3,5,9,6};  
	}  

	public static void main(String args[]){  
		//calling method  
		int arr[]=get();  

		for(int i=0;i<arr.length;i++)  
			System.out.println(arr[i]);  
	}
}
