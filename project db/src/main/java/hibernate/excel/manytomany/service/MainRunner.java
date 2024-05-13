package hibernate.excel.manytomany.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("project_db");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		transaction.begin();
		//manager.persist(transaction);
		transaction.commit();
	}

}
