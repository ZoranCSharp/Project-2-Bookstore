package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.Book;
import com.bookstore.repository.BookRepository;

public interface BookService {
	
	List<Book> findAll ();
	
	Book findOne(Long id);
	
	List<Book> findByCategory(String category);
}
