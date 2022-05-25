package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.action.internal.EntityIdentityInsertAction;

public class CompanyController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Companey companey = new Companey();
		companey.setName("VenkyTechnologis");
		companey.setPhoneno(965314585);
		companey.setWeb("venkey@techno");

		Gst gst = new Gst();
		gst.setState("karnataka");
		gst.setCountry("India");
		gst.setGstnumber("vk123@vk");
		gst.setCompaney(companey);

		entityTransaction.begin();
		entityManager.persist(companey);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
