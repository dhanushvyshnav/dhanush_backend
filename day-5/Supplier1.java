package collections;

import java.util.function.Supplier;

public interface Supplier1 
{
	public static void main(String[] args) {
		
	
	Supplier<String> s1= ()-> "Hello Excel";
	System.out.println(s1.get());

	}
}