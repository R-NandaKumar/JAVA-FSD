package com.hibernet.apps;


import org.hibernate.cfg.Configuration;

import com.hibernet.entities.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonAdd 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
	    SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
	Person person = new Person();
	person.setPersonid(1001);
	person.setPersonName("Sahasra");
	person.setEmail("Sahasra@gmial.com");
	person.setPhoneno(6363464659l);
	
	s.save(person);   //it will send the data to db
	t.commit();	//it will saves the data to db permanentely
	
	System.out.println("Data Saved.........");
		
	s.close();
	sf.close();

	}
}
