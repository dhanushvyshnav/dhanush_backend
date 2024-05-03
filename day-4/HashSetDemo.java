package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
	public Integer id;
	public String name;
	public Integer sal;

	public HashSetDemo(Integer id, String name, Integer sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString()
	{
		return this.id + " "+ this.name+ " "+ this.sal ;	
	}
	@Override
	public int hashCode()
	{
		return this.id;
	}

	@Override
	public boolean equals (Object e)
	{
		HashSetDemo hsd= (HashSetDemo) e;
		return this.hashCode()==hsd.hashCode();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<HashSetDemo> hs= new HashSet<>();
		while(true)
		{
			System.out.println("Enter employee Id: ");
			int id= sc.nextInt();

			System.out.println("Enter employee Name: ");
			String name= sc.next();

			System.out.println("Enter employee sal: ");
			int sal= sc.nextInt();

			
			hs.add(new HashSetDemo(id, name, sal));
			System.out.println("Wanna add more Employee details ?");
			if(! sc.next().equalsIgnoreCase("yes"));
			break;
		}
		Iterator<HashSetDemo> itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}



}
