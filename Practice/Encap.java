package practice;

public class Encap 
{
	private long acc_no;  
	private String name,email;  
	private float amount;
	
	
	public long getAcc_no() 
	{
		return acc_no;
	}
	public void setAcc_no(long acc_no) 
	{
		this.acc_no = acc_no;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public float getAmount() 
	{
		return amount;
	}
	public void setAmount(float amount) 
	{
		this.amount = amount;
	}
	public static void main(String[] args) {
		Encap en= new Encap();
		 en.setAcc_no(7353511000L);  
		    en.setName("John Doe");  
		    en.setEmail("johndoe@excelindia.com");  
		    en.setAmount(18000f);  
		    System.out.println(en.acc_no+" "+en.name+" "+en.email+" "+en.amount);
	}

}
