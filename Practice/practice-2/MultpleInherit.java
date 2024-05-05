package practice;

public interface MultpleInherit 
{
	void print();  
	}  
	interface Showable
	{  
	void print();  
	}  
	  
	class Test0 implements MultpleInherit, Showable
	{  
	public void print()
	{
		System.out.println("Hello javatpoint !");
		}  
	public static void main(String args[])
	{  
	Test0 t = new Test0();  
	t.print();  
	 }  

}
