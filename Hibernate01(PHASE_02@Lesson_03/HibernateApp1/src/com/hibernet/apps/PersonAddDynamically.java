package com.hibernet.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernet.entities.Person;

public class PersonAddDynamically {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person person = new Person();
		System.out.println("Person ID : ");
		person.setPersonid(sc.nextInt());
		System.out.println("Person Name : ");
		person.setPersonName(sc.next());
		System.out.println("Person Email : ");
		person.setEmail(sc.next());
		System.out.println("Person Phone  Number : ");
		person.setPhoneno(sc.nextLong());
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();		

		session.save(person); // it will sends data to the db
		trans.commit();  // it will saves data in db permently
		
		System.out.println("Data Saved.....");
		
		session.close();
		sf.close();
	}
}
