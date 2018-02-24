package com.parque.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.parque.domain.Cliente;

public class ClienteDAO {
	
	protected EntityManager entityManager;
	
	 private static ClienteDAO instance;
	 
	 public static ClienteDAO getInstance(){
         if (instance == null){
                  instance = new ClienteDAO();
         }
         
         return instance;
	 }
	 
	 private ClienteDAO() {
			System.out.println("CONSTRUCTOR");
         entityManager = getEntityManager();
	 }
	 
	 

	private EntityManager getEntityManager() {
		EntityManagerFactory factory=null;
		System.out.println("FACTORY");
		
		try {
			
		factory = Persistence.createEntityManagerFactory("crud");
		
		 if (entityManager == null) {
             entityManager = factory.createEntityManager();         
		 }
		 
		}
		catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		return entityManager;

	}
	
	 public void persist(Cliente cliente) {
         try 
         {
                  entityManager.getTransaction().begin();
                  entityManager.persist(cliente);
                  entityManager.getTransaction().commit();
                  
         } catch (Exception ex) {
                  ex.printStackTrace();
                  entityManager.getTransaction().rollback();
         }
	 }

}
