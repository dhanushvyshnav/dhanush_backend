package practice;

public abstract class Shape 
{
	abstract void draw();  
}  

class Rectangle extends Shape
{  
	void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle1 extends Shape
{  
	void draw(){System.out.println("drawing circle");
	}  
}  
class Test2
{  
	public static void main(String args[])
	{  
		Shape s=new Circle1(); 
		s.draw();  
	}  


}
