package com.example.accessingdatamysql;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "book")
public class Book {
	@Id
	@Column(name = "isbn")
	private String isbn;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "number_of_pages")
	private Integer number_of_pages;

	@Column(name = "published_date")
	private String published_date;

	@Column(name = "pub_name")
	private String pub_name;

	@Column(name = "new_desc")
	private String new_desc;

	public String getNew_desc() {
		return new_desc;
	}

	public void setNew_desc(String new_desc) {
		this.new_desc = new_desc;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(Integer number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public String getPublished_date() {
		return published_date;
	}

	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}

	public String getPub_name() {
		return pub_name;
	}

	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}

	public static Book from(String isbn) {
		Book book = new Book();
		book.setIsbn(isbn);
		return book;
	}
}
