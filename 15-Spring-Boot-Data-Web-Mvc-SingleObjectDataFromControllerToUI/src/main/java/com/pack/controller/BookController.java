package com.pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pack.bean.Book;

@Controller
public class BookController 
{
	@GetMapping("/welcome")
	public String getBookData(Model model)
	{
		Book book = new Book(101 , "Java" ,"89709");
		model.addAttribute("message", book);
		return "welcome";
	}
	
	@GetMapping("/books")
	public String getAllBooks(Model model)
	{
		List<Book> list = new ArrayList<>();
		list.add(new Book(1, "Telugu", "100"));
		list.add(new Book(2, "Hindi", "300"));
		list.add(new Book(3, "Science", "600"));
		list.add(new Book(4, "Maths", "500"));
		
		model.addAttribute("message", list);
		return "Allbooks";
	}
}
