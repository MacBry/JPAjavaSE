package com.mac.bry.app;

import com.mac.bry.dao.BookDAO;
import com.mac.bry.dao.BookDAOimpl;
import com.mac.bry.model.Book;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("1515151515","RRMARTIN","PIESNI LODU");
		BookDAO bookDAO = new BookDAOimpl();
		bookDAO.addBook(book);
		System.out.println("Book added");
		bookDAO.cleanUp();
	}

}
