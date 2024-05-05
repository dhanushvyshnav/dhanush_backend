package practice;

public class Overloading1 
{
	void sum(int a)
	{
		System.out.println(a);
	}
	 void sum(int a,long b)
	 {
		 System.out.println(a+b);
		 }  
	 
	  void sum(int a,int b,int c)
	  {
		  System.out.println(a+b+c);
		  }  
	  
	  public static void main(String args[]){  
	  Overloading1 ol1=new Overloading1(); 
	  ol1.sum(20);
	  ol1.sum(20,20);  
	  ol1.sum(20,20,20);  
}
}
			  
