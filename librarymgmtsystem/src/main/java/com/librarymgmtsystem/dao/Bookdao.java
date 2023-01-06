package com.librarymgmtsystem.dao;

import java.util.List;

import com.librarymgmtsystem.entity.Book;

public interface Bookdao {
   int insertRecord(Book b);
   int updateRecord(Book b);
   //int deleteRecord(Book b);
   List<Book> getAllBooks();
}
