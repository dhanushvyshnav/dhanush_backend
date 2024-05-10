//package com.excel.hibernate_excelsoft.onetomany;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.excel.hibernate_excelsoft.onetomany.entity.Laptop;
//import com.excel.hibernate_excelsoft.onetomany.entity.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainRunner {
//
//	public static void main(String[] args) {
//
//		EntityManagerFactory factory= Persistence.createEntityManagerFactory("student");
//		EntityManager manager= factory.createEntityManager();
//		EntityTransaction transaction= manager.getTransaction();
//
//		List<Laptop> laptops= new ArrayList<>();
//
//		Laptop laptop1= new Laptop();
//		Laptop laptop2= new Laptop();
//		Laptop laptop3= new Laptop();
//		Student student= new Student();
//
//		laptop1.setBrand("Dell");
//		laptop1.setSerialNo("G1H34HDG");
//		laptop1.setStudent(student);
//
//		laptop2.setBrand("HP");
//		laptop2.setSerialNo("UV86HWO2");
//		laptop2.setStudent(student);
//
//		laptop3.setBrand("MAC");
//		laptop3.setSerialNo("M4A24TVPQ");
//		laptop3.setStudent(student);
//
//		laptops.add(laptop1);
//		laptops.add(laptop2);
//		laptops.add(laptop3);
//
//		student.setName("paul");
//		student.setAge(20);
//		student.setLaptops(laptops);
//
//		transaction.begin();
//		manager.persist(student);
//		transaction.commit();
//		System.out.println(manager.find(Student.class, 1));
//
//	}
//}
