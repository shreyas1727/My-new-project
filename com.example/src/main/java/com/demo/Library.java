package com.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
	@Id
	private int id;
	private String book;
	private String author;
	private double price;
	private int count;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", book=" + book + ", author=" + author + ", price=" + price + ", count=" + count
				+ ", type=" + type + ", getId()=" + getId() + ", getBook()=" + getBook() + ", getAuthor()="
				+ getAuthor() + ", getPrice()=" + getPrice() + ", getCount()=" + getCount() + ", getType()=" + getType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

