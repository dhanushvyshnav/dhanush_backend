package collections;

public class Employee2 
{
	public Integer id;
	public String name;
	public String designation;
	public String dept;
	
	public Employee2(Integer id, String name, String designation, String dept ) 
	{
		super();
		this.id = id;
		this.name = name;
		this.designation = designation ;
		this.dept = dept;
	}
	
	
	public Employee2(String string, String string2, String string3) 
	{

	}


	@Override
	public String toString()
	{
		return this.id+" "+ this.name+" "+ this.designation+" "+this.dept;
	}
//	@Override
//	public int hashCode()
//	{
//		return this.id;
//	}
	
	@Override
	public boolean equals (Object e)
	{
		Employee2 emp2= (Employee2) e;
		return this.hashCode()==emp2.hashCode();
	}

}
