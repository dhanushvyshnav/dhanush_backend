package collections;

import java.util.function.Consumer;

public interface Consumer1 
{
	public static void main(String[] args)
	{
		Consumer<String> c= s-> System.out.println(s);
		Consumer<String> c2= s-> System.out.println(s.length());

		c.accept("Cruise");
		c.andThen(c2).accept("Peterr!!");

	}
}