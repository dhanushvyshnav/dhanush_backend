package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {

	public Integer marks;
	public String name;
	public Integer age;


	public Student(Integer marks, String name, Integer age) 
	{
		this.marks = marks;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return this.marks+ " "+ this.name+" "+this.age;
	}

	@Override
	public int hashCode()
	{
		return this.age;
	}

	@Override
	public boolean equals (Object e)
	{
		Student st= (Student) e;
		//return this.hashCode()==st.hashCode();
	return this.name==st.name && this.marks==st.marks;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Set<Student> st= new HashSet <>();

		while(true)
		{
			System.out.println("Enter Student Marks: ");
			int marks= sc.nextInt();

			System.out.println("Enter Student Name: ");
			String name= sc.next();

			System.out.println("Enter Student age: ");
			int age=sc.nextInt();

			st.add(new Student(marks, name, age));
			System.out.println("Wanna add more student details?");

			if( sc.next().equalsIgnoreCase("no"))
				break;
		}
		Iterator<Student> itr= st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
