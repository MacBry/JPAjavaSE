package com.mac.bry.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mac.bry.model.Book;

public class BookDAOimpl implements BookDAO {

	private EntityManagerFactory EMF;
	private EntityManager entityManager;
	
	
	
	
	public BookDAOimpl() {
		super();
		EMF = Persistence.createEntityManagerFactory("myPersistenceUnit");
		this.entityManager = EMF.createEntityManager();
	}

	@Override
	public void addBook(Book book) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(book);
		transaction.commit();

	}

	@Override
	public Book getBook(Long id) {
		Book book =entityManager.find(Book.class, id); 
		return book;
	}

	@Override
	public void cleanUp() {
		entityManager.close();
		EMF.close();

	}

}
