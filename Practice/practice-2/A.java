package practice;

public interface A 
{
	void a();  
	void b();  
	void c();  
	void d();  
}  

abstract class B implements A
{  
	public void c()
	{
		System.out.println("I am calvin");
	}  
}  

class M extends B
{  
	public void a()
	{
		System.out.println("I am adam");
	}  
	public void b()
	{
		System.out.println("I am bailey");
	}  
	public void d()
	{
		System.out.println("I am daisy");
	}  
}  

class Test3
{  
	public static void main(String args[]){  
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}
}
