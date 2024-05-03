package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Comparator<TreeSetDemo> com =  new Comparator<TreeSetDemo>() 
		{
			@Override
			public int compare(TreeSetDemo o1, TreeSetDemo o2) {
				
				return ((Integer)o1.id).compareTo(o2.id);
			}
		};
	TreeSet<TreeSetDemo> ts= new TreeSet<TreeSetDemo>(com);
	while(true)
	{
		System.out.println("Enter employee Id: ");
		int id= sc.nextInt();

		System.out.println("Enter employee Name: ");
		String name= sc.next();

		System.out.println("Enter employee sal: ");
		int sal= sc.nextInt();
		
		ts.add(new TreeSetDemo(id, name, sal));
		System.out.println("Wanna add more Employee details?");
		
		if(sc.next().equalsIgnoreCase("no"));
		break;
	}
	Iterator<TreeSetDemo>itr= ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	}

}
