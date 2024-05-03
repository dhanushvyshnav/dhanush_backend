package collections;

public class TreeSetDemo 
{
	public Integer id;
	public String name;
	public Integer sal;

	public TreeSetDemo(Integer id, String name, Integer sal)
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
	public boolean equals(Object e)
	{
		TreeSetDemo td=(TreeSetDemo) e;
		return this.hashCode()==td.hashCode();
	}

}

