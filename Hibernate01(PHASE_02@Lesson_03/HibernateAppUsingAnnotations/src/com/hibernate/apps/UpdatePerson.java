package com.hibernate.apps;

import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Person;

public class UpdatePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person ID : ");
		int pno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		TypedQuery  qry = session.createQuery("from Person where personid=:pn");
		qry.setParameter("pn", pno);
		List<Person>  lst = qry.getResultList(); 
		
		if(lst.isEmpty())
			System.out.println("No person info found....");
		else
		{
			System.out.println("Enter Person New Name to Modify ");
			String pname = sc.next();
			System.out.println("Enter Person New Email to Modify ");
			String email = sc.next();
			
			TypedQuery uqry = session.createQuery("update Person set personName=:pna, email=:em where personid=:pid");
			uqry.setParameter("pna", pname);
			uqry.setParameter("em", email);
			uqry.setParameter("pid", pno);
			int sts = uqry.executeUpdate();
			if(sts>=1)
			{
				trans.commit();
				System.out.println("Update Success");
			}
		}
	}
}
