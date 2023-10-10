package com.operations;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.DbConnection;
import com.entities.Books;

public class BookOperations {

	private SessionFactory  sfact = null;
	public BookOperations()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void AddBooks(Books book)
	{
		Session session = sfact.openSession();
		Transaction trans = session.beginTransaction();
		session.save(book);
		trans.commit();
		session.close();
	}
	
	public List<Books>  ViewAll()
	{
		Session session = sfact.openSession();
		TypedQuery  qry = session.createQuery("from Books");
		List<Books>  ball = qry.getResultList();
		return ball;
	}
	
}
