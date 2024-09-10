package com.ashokit.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.book.model.Book;
import com.ashokit.book.repository.BookRepository;
import com.ashokit.service.BookService;

@Service
public class BookServiceImpl implements BookService
{
	@Autowired
	private BookRepository repository;
	
	@Override
	public Book addBook(Book book) 
	{
		return repository.save(book);
	}
}
