package practice;

public interface Print1 
{
	void print();  
}  
interface Showable1 extends Print1
{  
	void show();  
}  
class Test4 implements Showable1
{  
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  

	public static void main(String args[])
	{  
		Test4 t4 = new Test4();  
		t4.print();  
		t4.show();  
	}
}
