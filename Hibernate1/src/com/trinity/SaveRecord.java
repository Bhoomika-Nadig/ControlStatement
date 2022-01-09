package com.trinity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveRecord {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
//		System.out.println(config.getClass().getName());
		config.addAnnotatedClass(Employee.class);

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee emp = new Employee();
		emp.setName("Dravid");
		emp.setId(3);
		emp.setAge(54);
		emp.setAddress("IND");

		int save = (int) session.save(emp);

		System.out.println(save);
		Employee emp1 = session.get(Employee.class, 0);
//		emp1.setAddress("IND");
//
//		session.saveOrUpdate(emp1);
		session.delete(emp1);
		System.out.println(emp1);

		transaction.commit();

		if (session != null) {
			session.close();
		}
		if (factory != null) {
			factory.close();
		}

	}
}
