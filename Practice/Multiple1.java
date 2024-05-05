package practice;

public class Multiple1 
{
	void msg()
	{
		System.out.println("Hello");
	}  
}  
class Home
{  
	void msg()
	{
		System.out.println("Welcome");
	}  
}  
class C extends Multiple1, Home
{
	
}
	public static void main(String args[])
	{  
		C obj=new C();  
		obj.msg();
	}

