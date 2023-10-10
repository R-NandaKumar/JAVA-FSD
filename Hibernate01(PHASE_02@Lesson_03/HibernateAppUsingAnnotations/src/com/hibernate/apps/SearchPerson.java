package com.hibernate.apps;

import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Person;

public class SearchPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person ID : ");
		int pno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		TypedQuery  qry = session.createQuery("from Person where personid=:pn");
		qry.setParameter("pn", pno);
		List<Person>  lst = qry.getResultList(); 
		
		if(lst.isEmpty())
			System.out.println("No person info found....");
		else
		{
			for(Person p : lst)
			{
				System.out.println(p.getPersonid() + "\t" + p.getPersonName() + "\t" + p.getEmail()  + "\t" + p.getPhoneno());	
			}
		}
	}
}
