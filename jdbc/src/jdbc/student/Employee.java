package jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	private static Connection connection;
	private static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) 
	{
		Employee employee= new Employee();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/jdbc";
			String username= "root";
			String password= "Sa123";

			connection= DriverManager.getConnection(url, username,password);

			System.out.println("press 1 to insert new employee record");
			System.out.println("press 2 to select employee by id");
			System.out.println("press 3 to select all employees");
			System.out.println("press 4 to update employee fields");
			System.out.println("press 5 to delete employee");

			System.out.println("Please enter your choice");
			int  choice= sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("insert employee details");
				employee.insertRecord();
				break;
			case 2:
				System.out.println("select record by ID:");
				employee.selectRecordId();
				break;

			case 3:
				System.out.println("Select all record");
				employee.selectAllRecord();
				break;

			case 4:
				System.out.println("update the record");
				employee.udpateRecord();
				break;

			case 5:
				System.out.println("Delete the record");
				employee.deleteRecord();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	private void insertRecord() throws SQLException 
	{
		String query= "insert into employee(name,sal,dept) values(?, ?, ?)";
		PreparedStatement preparedStatement= connection.prepareStatement(query);

		System.out.println("Enter name");
		preparedStatement.setString(1, sc.next());

		System.out.println("Enter salary");
		preparedStatement.setDouble(2, sc.nextDouble());

		System.out.println("Enter deparatment");
		preparedStatement.setString(3, sc.next());

		int rows = preparedStatement.executeUpdate();
		if(rows!=0){
			System.out.println("Record inserted successfully");
		}
	}
	private void selectRecordId() throws SQLException
	{
		System.out.println("Enter ID to find the record");
		int number= Integer.parseInt(sc.nextLine());
		String query= "Select * from employee where id= "+ number;

		Statement statement= connection.createStatement();

		ResultSet resultSet= statement.executeQuery(query);
		if(resultSet.next())
		{
			int id= resultSet.getInt("id");
			String name= resultSet.getString("name");
			double salary = resultSet.getDouble(3);
			String department = resultSet.getString(4);

			System.out.println("ID: "+id);	
			System.out.println("Name: " + name);
			System.out.println("Salary: " + salary);
			System.out.println("Department: " + department);
		}
		else
		{
			System.out.println("No records Found");
		}
	}

	private void selectAllRecord() throws SQLException 
	{
		System.out.println("All the records from the table");

		String query = "select * from the employee";

		Statement statement= connection.createStatement();

		ResultSet resultSet= statement.executeQuery(query);

		while(resultSet.next())
		{
			int id= resultSet.getInt("id");
			String name= resultSet.getString("name");
			Double salary= resultSet.getDouble(3);
			String dept= resultSet.getString(4);

			System.out.println("ID: "+id+" Name: "+name+ " Salary: "+salary+" Depatment:"+dept );
		}
	}

	private void deleteRecord() throws SQLException 
	{
		System.out.println("Enter id to delete record");

		int number= Integer.parseInt(sc.nextLine());
		String query="Delete from employee where ID: "+ number;

		Statement statement= connection.createStatement();

		int rows= statement.executeUpdate(query);
		if(rows!=0)
		{
			System.out.println("Employee Record deleted successfully");
		}		
	}
	private void udpateRecord() throws SQLException 
	{
		System.out.println("Enter ID to update the record");
		int id = Integer.parseInt(sc.next());

		String query = "Select * from employee where id =" + id;
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		if (resultSet.next()) 
		{
			int id2 = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double sal = resultSet.getDouble("sal");
			String dept = resultSet.getString("dept");

			System.out.println("Employee id : " + id2);
			System.out.println("Name : " + name);
			System.out.println("Salary : " + sal);
			System.out.println("Department : " + dept);

			System.out.println("Enter the choice you need");
			System.out.println("Enter 1 if you want to update Employee name");
			System.out.println("Enter 2 if you want to update Employee salary");
			System.out.println("Enter 3 if you want to update Employee Depatment name");
			System.out.println();

			String updateQuery = "update employee set";

			int option = Integer.parseInt(sc.next());
			int choice=  sc.nextInt();;
			switch (choice) 
			{
			case 1:{
				System.out.println("Enter new name");
				String newName= sc.next();
				updateQuery = updateQuery + " name = ? where id =" + id;
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				preparedStatement.setString(1, newName);
				int row = preparedStatement.executeUpdate();
				if (row != 0)
					System.out.println("Record updated successfully");
				break;
			}
			case 2:{
				System.out.println("Enter new salary");
				double newSal= sc.nextDouble();
				updateQuery = updateQuery + " sal = ? where id =" + id;
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				preparedStatement.setDouble(1, sal);
				int row = preparedStatement.executeUpdate();
				if (row != 0)
					System.out.println("Record updated successfully");
				break;
			}
			case 3:{
				String newDept = sc.next();
				updateQuery = updateQuery + " dept = ? where id =" + id;

				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				preparedStatement.setString(1, newDept);
				int row = preparedStatement.executeUpdate();
				if (row != 0)
					System.out.println("Record updated successfully");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		}

	}
}
