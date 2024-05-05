package practice;

public class TestArray3 
{
	//passing an array as a parameter
	static void demo(int arr[])
	{  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		}  
	public static void main(String[] args) 
	{
		int a[]={4,5,2,9,7};
		demo(a);

	}

}
