package com.parque.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.parque.domain.Conta;

public class ContaDAO {
	
	protected EntityManager entityManager;
	
	private static ContaDAO instance;
	 
	 public static ContaDAO getInstance(){
        if (instance == null){
                 instance = new ContaDAO();
        }
        
        return instance;
	 }
	 
	 private ContaDAO() {
        entityManager = getEntityManager();
	 }
	 

	private EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
       if (entityManager == null) {
                entityManager = factory.createEntityManager();
       }

       return entityManager;
	
	}
	
	 public void persist(Conta conta) {
        try {
                 entityManager.getTransaction().begin();
                 entityManager.persist(conta);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
	 }
}
