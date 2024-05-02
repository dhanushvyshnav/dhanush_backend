package excel.oops;

public class MultipleCatch2 {

	public static void main(String[] args)
	{

		try {
			String s=null;  
			System.out.println(s.length());
		} 

		catch (Exception e) 
		{
			System.out.println("Exception occurs");
				 // e.printStackTrace();

		}
		System.out.println("String code");
	}

}
