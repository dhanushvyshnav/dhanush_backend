package collections;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SrtreamExample 
{
	public static void main(String[] args) 
	{
		List<Integer> asList=Arrays.asList(2,3,5,45,51,9,5,10);

		//Separate even and odd
		//		List<Integer> separate=asList.stream().filter(i->i%2==0).collect(Collectors.toList());
		//		System.out.println(separate);


		//Frequency of each character in string
		//		 String input= "Excelsoft_Mysore";
		//		 Map<Character, Long> collect=input.chars().mapToObj(c ->(char) c).
		//				 collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//		 System.out.println(collect);

		//Sort the list in reverse order
		//asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// Print multiple of 5 from the list
		//asList.stream().filter(i->i%5==0).forEach(System.out::println);

		//merge two unsorted arrays into one single sorted arrays
		//		 String[] a= {"1","3", "6"};
		//		 String []b= {"2","5", "4", "8"};
		//		 Object[] merged= Stream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		//		 System.out.println(Arrays.toString(merged));

		//merge two unsorted arrays into one single sorted arrays without duplicates
		//		 String[] a= {"1","3", "4","6"};
		//		 String []b= {"2","6", "4", "8"};
		//		 Object[] merged= Stream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		//		 System.out.println(Arrays.toString(merged));

		//		 //Min 3 numbers
		//		 asList.stream().sorted().limit(3).forEach(System.out::println);
		//		 //Max 3 elements
		//		 asList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		// Sort list of strings in increasing order of their length
		//		 List<String> input= Arrays.asList("one","eleven", "four");
		//		input.stream().sorted(Comparator.comparing(String:: length)).
		//		forEach(System.out::println);

		//		// sum and average of all elements of an array
		//		// sum
		//		int[] a = {1,2,3,4,5,6};
		//		long sum= Arrays.stream(a).sum();
		//		System.out.println(sum);
		//		// average
		//		double average= Arrays.stream(a).average().getAsDouble();
		//		System.out.println(average);


		//		//last element of an array
		//		List<String> input= Arrays.asList("Excelsoft");
		//		input.stream().skip(input.size()-1).findFirst().get();

		//		// age of a person
		//				LocalDate birthDay=LocalDate.of(2001,01,11);
		//				LocalDate today=LocalDate.now();
		//				System.out.println(ChronoUnit.YEARS.between(birthDay, today));



		//remove duplicate element from list
		//asList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

		//		//Frequency of each element in an array
		//		Map<Integer, Long> each= asList.stream().collect(Collectors.groupingBy
		//				(Function.identity(),Collectors.counting()));
		//		System.out.println(each);

		//		// join list of string with prefix, suffix and delimiter
		//		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");  
		//		String result= fruits.stream().collect(Collectors.joining("Delimer", "Prefix", "Suffix"));
		//		System.out.println(result);

		//		// maximum and minimum in a list
		//		//Maximum
		//		int max = asList.stream().max(Comparator.naturalOrder()).get();
		//		System.out.println(max);
		//		// Minimum
		//		int min = asList.stream().min(Comparator.naturalOrder()).get();
		//		System.out.println(min);

		//Anagram program
		//		String s1= "earth";
		//		String s2= "heart";
		//		Map<String, Long> s = Stream.of(s1.split("")).map(String:: toUpperCase).sorted().collect(Collectors.joining());
		//		System.out.println(s);


		//	// sum of all digits of a number
		//		List<String> course = Arrays.asList("fullstack","devops");
		//		Stream.of(String.valueOf(asList).split(""))
		//        .collect(Collectors.summarizingInt(Integer::parseInt));


		//second largest number in a integer array
		//		int second= asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		//		System.out.println(second);

		//Common Element between two Arrays
		//		List<Integer> list1= Arrays.asList(2,4,1,33);
		//		List<Integer> list2 = Arrays.asList(5,7,3,4,2);
		//		list1.stream().filter(list2::contains).forEach(System.out::println);

		//reverse each word of a string
		//		List<String> input= Arrays.asList("hello");
		//		Arrays.stream(str.split(" ")).map(word-> new StringBuffer(word).reverse().
		//				collect(Collectors.joining()));
		//		

		// Sum of first 10 natural numbers
		//		int s= IntStream.range(1,20).sum();
		//		System.out.println(s);

		//		//Find strings which starts with number
		//		List<String> input= Arrays.asList("java", "4.Net", "python");
		//		input.stream().filter(str->Character.isDigit(str.charAt(0))).
		//		forEach(System.out::println);


		//Find duplicate element in an array
		//		asList.stream().filter(i -> Collections.frequency(asList, i) >1)
		//        .collect(Collectors.toSet()).forEach(System.out::println);

		//fibonacci program
		Stream.iterate(new int[]{0,1}, f-> new int[] {f[1], f[0]+f[1]}).
		limit(10).map(f->f[0]).forEach(i->System.out.print(i+ " "));
	}
}
