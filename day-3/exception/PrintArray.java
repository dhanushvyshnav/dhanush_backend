package excel.oops;

public class PrintArray 
{
	public static void main(String[] args) 

	{
		try
		{
			int arr []= {1,2,3};
			System.out.println(arr[10]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println(" the array");
	}
}
