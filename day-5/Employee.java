package collections;

public class Employee 
{

	private Integer id;
	private String name;
	private Integer sal;
	
	
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Integer getSal() 
	{
		return sal;
	}
	public void setSal(Integer sal) 
	{
		this.sal = sal;
	}
	
	
	public Employee(Integer id, String name, Integer sal) 
	{super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee() 
	{
		
	}
//	public Integer toString(Object o)
//	{
//		return this.id;	
//	}
//	@Override
//	public int compareTo(Object o) {
//		return id;
//	}
	@Override
	
	public String toString()
	{
		return this.id+" "+ this.name+" "+ this.sal;
	}
	
	
	
	
	
	
	


}
