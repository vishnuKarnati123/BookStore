package com.vishnu.bookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishnu.bookstore.model.Book;

public interface BookStoreRepository extends MongoRepository<Book, String> {

}
