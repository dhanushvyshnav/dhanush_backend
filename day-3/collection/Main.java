package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList<Employee> li= new LinkedList<>();
		Scanner sc= new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter employee Id: ");
			int id= sc.nextInt();

			System.out.println("Enter employee Name: ");
			String name= sc.next();

			System.out.println("Enter employee sal: ");
			int sal= sc.nextInt();

			li.add(new Employee(id, name, sal));
			System.out.println("Wanna add more Employee details ?");

			if(! sc.next().equalsIgnoreCase("yes"))
				break;

		}
		li.sort((o1,o2) ->o1.getId().compareTo(o2.getId()));
		for(Employee emp :li)
		{
			System.out.println("id:"+emp.getId()+ "  name:"+ emp.getName()+"  salary:"+ emp.getSal());
		}

	}

}
