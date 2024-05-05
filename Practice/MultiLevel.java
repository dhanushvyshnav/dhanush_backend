package practice;

public class MultiLevel 
{
	void eat()
	{
		System.out.println("eating");
	}  
}  
class Dog1 extends MultiLevel
{  
	void bark()
	{
		System.out.println("barking");
	}  
}  
class BabyDog extends Dog1
{  
	void weep()
	{
		System.out.println("weeping");
		}  
}  
class TestInheritance2{  
	public static void main(String args[])
	{  
		BabyDog bd=new BabyDog();  
		bd.weep();  
		bd.bark();  
		bd.eat();  
	}
}
