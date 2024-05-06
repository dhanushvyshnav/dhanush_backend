package collections;

import java.util.function.Function;

public interface Function1 
{
	public static void main(String[] args) {
		
		Function<String, Integer> f= s-> s.length();
		Function<String, String> g= s-> s.toUpperCase();
		
		System.out.println(f.apply("tom"));
		System.out.println(g.apply("Dom"));
		System.out.println(g.andThen(f).apply("domToretto"));
		
	}
}
