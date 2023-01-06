package com.librarymgmtsystem.mapping;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarymgmtsystem.dao.Bookdao;
import com.librarymgmtsystem.dao.Librarydao;
import com.librarymgmtsystem.entity.Book;
import com.librarymgmtsystem.entity.Library;

public class Mapping {

	public static void main(String[] args) {
     ApplicationContext context =new ClassPathXmlApplicationContext("Bean.xml");
     Bookdao dao=(Bookdao) context.getBean("Bookdao");
     Librarydao libdao=(Librarydao) context.getBean("Libraryda");
     
     Book b=new Book();
     b.setBookname("java programming");
     b.setAuthorname("Balu");
     Book b1=new Book();
     b1.setBookname("python programming");
     b1.setAuthorname("satwik");
     Book b2=new Book();
     b2.setBookname("C language");
     b2.setAuthorname("Vinay");
     Book b3=new Book();
     b3.setBookname("C++ Language");
     b3.setAuthorname("deepak");
     
   ArrayList<Book> al=new ArrayList();
   al.add(b);
   al.add(b1);
   ArrayList<Book> al1=new ArrayList();
   al1.add(b2);
   al1.add(b3);

   Library lib=new Library();
   lib.setLibraryname("meghaLibrary");
   lib.setBook(al);
   Library lib1=new Library();
   lib1.setLibraryname("balulibrary");
   lib1.setBook(al1);
   
   
	}

}
