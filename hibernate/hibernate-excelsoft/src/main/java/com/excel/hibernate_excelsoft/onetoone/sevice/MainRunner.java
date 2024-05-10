//package com.excel.hibernate_excelsoft.onetoone.sevice;
//
//import com.excel.hibernate_excelsoft.onetoone.entity.MarksCard;
//import com.excel.hibernate_excelsoft.onetoone.entity.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainRunner {
//
//	private static EntityManagerFactory factory;
//	private static EntityManager manager;
//	private static EntityTransaction transaction;
//
//	public static void main(String[] args) 
//	{
//		factory= Persistence.createEntityManagerFactory("student");
//		manager= factory.createEntityManager();
//		transaction= manager.getTransaction();
//
//		MarksCard card = new MarksCard();
//		card.setGrade("A");
//		card.setMarks(86);
//		
//		
//		Student st= new Student();
//		st.setName("steve");
//		st.setAge(27);
//		//-->
//		card.setStudent(st);
//		st.setMarksCard(card);
//
//		transaction.begin();
//		manager.persist(st);
//		transaction.commit();
//		
//		manager.close();
//	}
//
//}
