package com.tn.isamm.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = session.beginTransaction();
		
}catch(Exception e){
	
}
}
}
