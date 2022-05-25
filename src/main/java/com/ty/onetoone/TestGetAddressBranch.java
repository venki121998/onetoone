package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAddressBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Branch branch= entityManager.find(Branch.class,1);
		System.out.println(branch.getId());
		System.out.println(branch.getName());
		System.out.println(branch.getState());
		System.out.println(branch.getCountry());
		System.out.println(branch.getAddress1());
		
		Address address= branch.getAddress1();
		System.out.println(address.getId());
		System.out.println(address.getName());
		System.out.println(address.getDoarno());
		
	}

}
