package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteAddreesBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch= entityManager.find(Branch.class, 1);
		if(branch!= null){
		Address address= branch.getAddress1();
		
		entityTransaction.begin();
		entityManager.remove(branch);
		entityTransaction.commit();
		}
		else
		{
			System.out.println("invalid id");
		}
	}

}
