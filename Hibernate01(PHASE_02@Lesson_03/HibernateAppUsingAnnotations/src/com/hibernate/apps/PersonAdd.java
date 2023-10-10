package com.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.entities.Person;

public class PersonAdd {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Person person = new Person();
		//person.setPersonid(1001);
		person.setPersonName("Sahasra");
		person.setEmail("Sahasra@gmail.com");
		person.setPhoneno(9900123456L);

		session.save(person); // it will sends data to the db
		trans.commit();  // it will saves data in db permently
		
		System.out.println("Data Saved.....");
		
		session.close();
		sf.close();
	}
}
