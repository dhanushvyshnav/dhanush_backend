package excel.oops;

public class MulitpleCatch {

	public static void main(String[] args) {
		
		  try {
			int a[]=new int[5];    
			  a[5]=30/0;    
			  System.out.println(a[10]);
			  
		} 
		  catch(ArithmeticException e)  
          {  
            System.out.println("Arithmetic Exception ");  
           }    
        catch(ArrayIndexOutOfBoundsException e)  
           {  
            System.out.println("ArrayIndexOutOfBounds Exception");  
           }    
        catch(Exception e)  
           {  
            System.out.println("Parent Exception");  
           }      
		  
		  System.out.println("multiple catch ");
	}

}
