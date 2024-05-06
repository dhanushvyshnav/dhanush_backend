package collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		//Comparator<Interger> com= Comparable::compareTo;
		
		Comparator<Integer>com = new Comparator<Integer>() 
		{
			@Override
			public int compare(Integer o1, Integer o2) 
			{
				return (o1).compareTo(o2);
			}
		};
		TreeMap<Integer, Employee> trm= new TreeMap<>(com);
		while(true)
		{
			System.out.println("Enter employee Id: ");
			int id= sc.nextInt();

			System.out.println("Enter employee Name: ");
			String name= sc.next();

			System.out.println("Enter employee sal: ");
			int sal= sc.nextInt();

			trm.put(id,new Employee(id,name, sal));
			System.out.println("Wanna add more Employee details?");
			String res= sc.next();
			if(res.equalsIgnoreCase("no"))
			break;
		}
		sc.close();
		Set<Entry<Integer, Employee>> entrySet= trm.entrySet();
		for(Entry<Integer, Employee> entry: entrySet)
		{
			System.out.println(entry.getKey()+ "--->"+ entry.getValue());
		}

	}

}
