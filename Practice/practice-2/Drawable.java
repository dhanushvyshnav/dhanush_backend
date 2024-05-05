package practice;

public interface Drawable 
{

	void draw();  
}  
class Rectangle2 implements Drawable
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle2 implements Drawable
{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
}  
class TestInterface1
{  
	public static void main(String args[])
	{  
		Drawable d=new Circle2();  
		d.draw();  
	}
}  
