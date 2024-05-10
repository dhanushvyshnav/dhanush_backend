package com.excel.hibernate_excelsoft.manytomany;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate_excelsoft.manytomany.entity.Book;
import com.excel.hibernate_excelsoft.manytomany.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args)
	{
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("student");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		List<Book> books= new ArrayList<Book>();
		List<Student> students= new ArrayList<Student>();
		Book b1= new Book();
		Book b2= new Book();
		Book b3= new Book();
	
		b1.setTitle("Atomic Habits");
		b2.setTitle("Psychology of Money");
		b3.setTitle("Love in Lockdown");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Student student1= new Student();
		Student student2= new Student();
		Student student3= new Student();
		
		student1.setName("David");
		student1.setBooks(books);
		
		student2.setName("Harry");
		student2.setBooks(books);
		
		student3.setName("Elon");
		student3.setBooks(books);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		b1.setStudents(students);
		b2.setStudents(students);
		b3.setStudents(students);
		
		transaction.begin();
		manager.persist(student1);
		transaction.commit();
	}

}
