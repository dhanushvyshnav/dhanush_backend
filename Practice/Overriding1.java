package practice;

public class Overriding1 
{
	void run()
	{
		System.out.println("Vehicle is running");
	}  
}  
class Bike extends Overriding1{  
	void run()
	{
		System.out.println("Bike is running safely");
		}  

	public static void main(String args[])
	{  
		Bike obj = new Bike();
		obj.run();
	}
}
