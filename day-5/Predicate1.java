package collections;

import java.util.function.Predicate;

public interface Predicate1 {

	public static void main(String[] args) 
	{
		Predicate<Integer> pr= a ->(a>14);
		System.out.println(pr.test(10));
	}
}
