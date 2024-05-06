package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	HashMap<Integer, Employee2> hm= new HashMap<Integer, Employee2>();

	hm.put(9, new Employee2("john", "trainee", "pls"));
	hm.put(5, new Employee2("david","ASE","Saras"));
	hm.put(8, new Employee2("Leo", "SSE", "K-12"));

	while(true)
	{
		System.out.println("Enter employee Id: ");
		int id= sc.nextInt();

		System.out.println("Enter employee Name: ");
		String name= sc.next();

		System.out.println("Enter employee Designation: ");
		String designation= sc.next();

		System.out.println("Enter employee Dept: ");
		String dept= sc.next();


		hm.put(id, new Employee2(name, designation, dept));

		System.out.println("Wanna add more Employee details ?");
		if(! sc.next().equalsIgnoreCase("yes"))
		break;
	}

	sc.close();
	Iterator<Integer> iterator= hm.keySet().iterator();
	while(iterator.hasNext());
	{

	}
	Set<Entry<Integer, Employee2>> entrySet= hm.entrySet();
	for(Entry<Integer, Employee2> entry: entrySet)
	{
		System.out.println(entry.getKey()+ "--"+ entry.getValue());
	}
	}
}
