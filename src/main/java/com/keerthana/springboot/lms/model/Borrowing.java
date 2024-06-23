package com.keerthana.springboot.lms.model;
import java.util.Date;

import jakarta.persistence.*;
@Entity
public class Borrowing {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
	
@ManyToOne
@JoinColumn(name="book_id",referencedColumnName="id")
private Book book;
@ManyToOne
@JoinColumn(name="member_id",referencedColumnName="id")
private Member member;
private Date borrowed_date;
private Date returnDate;
public Borrowing() {
    // Default constructor
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public Member getMember() {
	return member;
}
public void setMember(Member member) {
	this.member = member;
}
public Date getBorrowed_date() {
	return borrowed_date;
}
public void setBorrowed_date(Date borrowed_date) {
	this.borrowed_date = borrowed_date;
}
public Date getReturnDate() {
	return returnDate;
}
public void setReturnDate(Date returnDate) {
	this.returnDate = returnDate;
}
}
