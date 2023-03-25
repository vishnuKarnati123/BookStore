package com.vishnu.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.bookstore.model.Book;
import com.vishnu.bookstore.repository.BookStoreRepository;

@RestController
public class BookStoreController {

	@Autowired
	private BookStoreRepository bookStoreRepository;
	
	@GetMapping("/book")
	public String fetchBook()
	{
		return "book";
		
	}
	
	@GetMapping("/books")
	public List<Book> fetchBooks()
	{
		return bookStoreRepository.findAll();
		
	}
	
	@PostMapping("/books")
	public Book fetchBooks(@RequestBody Book book)
	{
		return bookStoreRepository.insert(book);
		
	}
}
