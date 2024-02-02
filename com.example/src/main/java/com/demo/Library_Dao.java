package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Library_Dao {


	public EntityManager getEntityManager() {

		return Persistence.createEntityManagerFactory("tejas").createEntityManager();
	}

	public void saveBook(Library library) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(library);
		entityTransaction.commit();
	}

	public void searchAuthor(Library library) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT l FROM Library  l.bookName = :library");
		query.setParameter("bookName", library);

		try {
			Library dbLibrary = (Library) query.getSingleResult();
			System.out.println(dbLibrary.toString());

		} catch (Exception e)

		{
			System.out.println("Book not found");
		}

	}

	public void searchBook(int id, String book) {

		EntityManager entityManager = getEntityManager();
		Library dbLibrary = entityManager.find(Library.class, id);
		if (dbLibrary != null) {
			System.out.println("Book found "+dbLibrary.toString());
		}
		else
		{
			System.out.println("Book not found");
		}
	}

}

