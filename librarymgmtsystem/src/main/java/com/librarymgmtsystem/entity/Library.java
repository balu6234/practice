package com.librarymgmtsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="StudentLibrary")
public class Library {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int libraryId;
private String libraryname;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="libraryId")
List<Book> book;

public int getLibraryId() {
	return libraryId;
}
public String getLibraryname() {
	return libraryname;
}
public List<Book> getBook() {
	return book;
}
public void setLibraryId(int libraryId) {
	this.libraryId = libraryId;
}
public void setLibraryname(String libraryname) {
	this.libraryname = libraryname;
}
public void setBook(List<Book> book) {
	this.book = book;
}

}
