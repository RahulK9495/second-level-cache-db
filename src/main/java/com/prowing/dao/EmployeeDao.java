package com.prowing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowing.entity.Employee;

public class EmployeeDao {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Ram", "HR", 8230300);

		SessionFactory sessionfcatory = HibernateUtil.getSessionFactory();

		Session session = sessionfcatory.openSession();

		Transaction transaction = session.beginTransaction();

		// session.save(employee1);

		Employee emp1 = session.get(Employee.class, 1);
		System.out.println(emp1);

		transaction.commit();

		session.close();

		Session session2 = sessionfcatory.openSession();

		Transaction transaction2 = session2.beginTransaction();

		Employee emp2 = session2.get(Employee.class, 1);
		System.out.println(emp2);

		transaction2.commit();

		session2.close();
	}

}
