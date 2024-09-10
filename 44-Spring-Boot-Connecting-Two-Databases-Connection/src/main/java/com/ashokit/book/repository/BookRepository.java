package com.ashokit.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{

}