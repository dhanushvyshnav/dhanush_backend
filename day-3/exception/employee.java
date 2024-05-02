package excel.oops;

public class employee {

	public static void main(String[] args) {
		
		try {
			int a=10/0;
		}
		
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("the zero exception");
	}

}
