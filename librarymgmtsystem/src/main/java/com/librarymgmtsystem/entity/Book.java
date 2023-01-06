package com.librarymgmtsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentBooks")
public class Book{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookid;
	@Column(name="BookName")
	private String Bookname;
	@Column(name="Author")
	private String Authorname;
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public String getAuthorname() {
		return Authorname;
	}
	
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
}