package practice;

public class SingleLevel 
{
	public void eat()
	{
		System.out.println("eating ");
	}  
}
class Dog extends SingleLevel
{  
	public void bark()
	{
		System.out.println("barking");
	}  
	public static void main(String args[]){  
		Dog d = new Dog();  
		d.bark();
		d.eat();
	}
}
