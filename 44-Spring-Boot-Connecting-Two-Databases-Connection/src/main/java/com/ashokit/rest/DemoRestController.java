package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.book.model.Book;
import com.ashokit.serviceimpl.BookServiceImpl;
import com.ashokit.serviceimpl.UserServiceImpl;
import com.ashokit.user.model.User;

@RestController
public class DemoRestController 
{
	@Autowired
	private BookServiceImpl bookServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@GetMapping("/welcome")
	public String hello()
	{
		return "Hello";
	}
	@PostMapping(value = "/addBook")
	public ResponseEntity<Book> addData(@RequestBody Book book)
	{
		Book addBook = bookServiceImpl.addBook(book);
		return new ResponseEntity<Book>(addBook, HttpStatus.CREATED);
	}

	@PostMapping(value = "/addUser")
	public ResponseEntity<User> addData(@RequestBody User user)
	{
		User addUser = userServiceImpl.addUser(user);
		return new ResponseEntity<User>(addUser, HttpStatus.CREATED);
	}

//	@GetMapping("/getUsers")
//	public List<User> getUsers() {
//		return userRepository.findAll();
//	}
//
//	@GetMapping("/getBooks")
//	public List<Book> getBooks() {
//		return bookRepository.findAll();
//	}

}