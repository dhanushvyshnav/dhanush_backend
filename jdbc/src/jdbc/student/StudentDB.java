package jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDB {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner sc= new Scanner(System.in);
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user= "root";
			String password ="Sa123";

			Connection connection= DriverManager.getConnection(url, user, password);
			String query= "insert into studnet(name, percentage, address) vcalues(?, ?, ?)";

			PreparedStatement preparedStatement= connection.prepareStatement(query);

			System.out.println("Enter name");
			preparedStatement.setString(1, sc.next());

			System.out.println("Enter percentage");
			preparedStatement.setDouble(2, sc.nextDouble());

			System.out.println("Enter Address");
			preparedStatement.setString(3, sc.next());

			boolean execute= preparedStatement.execute();
			System.out.println(execute); 


		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
