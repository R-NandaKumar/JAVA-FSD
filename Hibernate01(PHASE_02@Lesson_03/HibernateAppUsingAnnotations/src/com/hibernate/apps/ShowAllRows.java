package com.hibernate.apps;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Person;

public class ShowAllRows {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		//Query  qry = session.createQuery("from Person");
		//List<Person>  lst = qry.list();
		
		TypedQuery  qry = session.createQuery("from Person");
		List<Person>  lst = qry.getResultList(); 
		
		for(Person p : lst)
		{
			System.out.println(p.getPersonid() + "\t" + p.getPersonName() + "\t" + p.getEmail()  + "\t" + p.getPhoneno());	
		}
	}

}
