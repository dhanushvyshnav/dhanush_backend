package practice;

public abstract class Bank2 
{
	abstract int getRateOfInterest();    
}    
class SBI2 extends Bank
{    
	int getRateOfInterest()
	{
		return 7;
	}    
}    
class PNB extends Bank
{    
	int getRateOfInterest()
	{
		return 8;
	}    
}    

class TestBank
{    
	public static void main(String args[])
	{    
		Bank b;  
		b=new SBI2();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}
