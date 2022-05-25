package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TesttosaveBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=new Branch();
		branch.setName("rajajinagr");
		branch.setState("karnataka");
		branch.setCountry("India");
		
		Address address= new Address();
		address.setName("bangalore 4thmain");
		address.setDoarno("ab123");
		branch.setAddress1(address);
		entityTransaction.begin();
		entityManager.persist(address);
		entityManager.persist(branch);
		entityTransaction.commit();
	
		
	}

}
