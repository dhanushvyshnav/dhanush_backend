package practice;

public class Hierarchical1 
{
	void eat()
	{
		System.out.println("eating");
	}  
}  
class Dog2 extends Hierarchical1
{  
	void bark(){System.out.println("barking");
	}  
}  
class Cat extends Hierarchical1
{  
	void meow(){System.out.println("meowing");
	}  
}  
class TestInheritance3
{  
	public static void main(String args[])
	{  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
	}
}
