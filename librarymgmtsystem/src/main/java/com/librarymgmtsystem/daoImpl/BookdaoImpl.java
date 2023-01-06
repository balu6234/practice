package com.librarymgmtsystem.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.librarymgmtsystem.dao.Bookdao;
import com.librarymgmtsystem.entity.Book;

public class BookdaoImpl implements Bookdao {
    private HibernateTemplate ht;
    
	@Override
	@Transactional
	public int insertRecord(Book b) {
		ht.save(b);
  		return 1;
	}

	@Override
	@Transactional
	public int updateRecord(Book b) {
		ht.update(b);
		return 0;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

	

}
