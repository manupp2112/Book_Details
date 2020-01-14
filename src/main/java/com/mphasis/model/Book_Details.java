package com.mphasis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book_Details {
	@Id
	private int id;
	private String book_title;
	private String book_publisher;
	private String book_isbn;
	private int book_num_of_pages;
	private int book_year;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public String getBook_isbn() {
		return book_isbn;
	}

	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}

	public int getBook_num_of_pages() {
		return book_num_of_pages;
	}

	public void setBook_num_of_pages(int book_num_of_pages) {
		this.book_num_of_pages = book_num_of_pages;
	}

	public int getBook_year() {
		return book_year;
	}

	public void setBook_year(int book_year) {
		this.book_year = book_year;
	}

	@Override
	public String toString() {
		return "Book_Details [id=" + id + ", book_title=" + book_title + ", book_publisher=" + book_publisher
				+ ", book_isbn=" + book_isbn + ", book_num_of_pages=" + book_num_of_pages + ", book_year=" + book_year
				+ "]";
	}

}
