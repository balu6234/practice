package com.librarymgmtsystem.daoImpl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.librarymgmtsystem.dao.Librarydao;
import com.librarymgmtsystem.entity.Library;

public class LibrarydaoImmpl implements Librarydao {
  private HibernateTemplate ht;

@Override
@Transactional
public int insertLibraryName(Library lib) {
	ht.save(lib);
	return 0;
}

public HibernateTemplate getHt() {
	return ht;
}

public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}
	
}
