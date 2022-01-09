package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.MobileEntity;

public class MobileImpl implements MobileDAO {

	public void saveMobileEntity() {
		

		System.out.println("Invoked saveMobileEntity()");
	     SessionFactory sessionFactory = null;
        Transaction trans = null;
        Session session = null;
        try {
       	 //step1 bootstrap the hibernate
		 Configuration confg = new Configuration();
		 
		 
       	 //step2
       	confg.configure("hibernate.cfg.xml");
       
       	//step3
       	confg.addAnnotatedClass(MobileEntity.class);
			 
       	 //step4
       	sessionFactory = confg.buildSessionFactory();
       	 session = sessionFactory.openSession();
       	// sessionFactory = SessionFactoryProvider.getSessionFactory();
       	 
       	MobileEntity mobile = new MobileEntity("Redmi11","REdmi","4g");
		 
		  trans=session.beginTransaction();
		
		session.save(mobile);
		session.persist(mobile);
		 trans.commit();
		 
		 session.close();
		 System.out.println("Done");
		 
	 }catch(HibernateException e) {
		 System.out.println("inside catch block!!!!");
		 trans.rollback();
		 System.out.println("transsaction rolled back");
	 }finally {
		 if(session!= null) {
			 session.close();
			 System.out.println("session is closed");
		 }else
			 System.out.println("session is not closed");
		 
	 
        if(sessionFactory != null) {
       	 sessionFactory.close();
       	 System.out.println("sessionFactory is closed ");
        }else
			 System.out.println("session is not closed");


}

	
}
}