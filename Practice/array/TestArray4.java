package practice;

public class TestArray4 
{
	static void printArray(int arr[])
	{  
		for(int i=0;i<arr.length;i++)  
			System.out.println(arr[i]);  
	}  

	public static void main(String args[])
	{ 
		//passing anonymous array to method  
		printArray(new int[]{4,5,2,9,7});
	}
}
