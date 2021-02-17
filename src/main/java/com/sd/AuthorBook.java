package com.sd;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Author;
import com.sd.entity.Book;
import com.sd.utils.HibernateUtil;

public class AuthorBook {

	public static void main(String[] args) {
	SessionFactory sessionfactory=	HibernateUtil.getsessionFactory();
	Session session=sessionfactory.openSession();
	
	Transaction txn=session.beginTransaction();
	Author a1=new Author(12,"james gosling");
	
	List<Book> book=new ArrayList<>();
	book.add(new Book(123,"java"));
	book.add(new Book(167,"c"));
	book.add(new Book(124,"j2ee"));
	
	for(Book b:book)
	{
	session.save(b);
	b.setAuthors(a1);
	}

	session.save(a1);
	
	txn.commit();

	}

}
