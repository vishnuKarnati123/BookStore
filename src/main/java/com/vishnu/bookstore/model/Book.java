package com.vishnu.bookstore.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="book")
public class Book {

	
	private String bookName;
	private String author;
	private String description;
	private int price;
	private List<String> reviews;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getReviews() {
		return reviews;
	}
	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", description=" + description + ", price=" + price
				+ ", reviews=" + reviews + "]";
	}
	
	
	
	
}
