package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

import java.util.List;

public class QueryStudentDemo {
	
	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		try {

			
			//start a transaction
			session.beginTransaction();
			
			//query students
			List<Student> theStudents = session.createQuery("from Student").list();
			
			//display the students
			displayStudents(theStudents);
			
			//query students: lastName='Doe'
			theStudents = session.createQuery("from Student s where s.lastName='Duck'").list();
			
			//display the students
			System.out.println("\n\nStudents who have last name of Duck");
			displayStudents(theStudents);
			
			//query students: lastName='Doe'
			theStudents = session.createQuery("from Student s where"+" s.lastName='Duck' OR s.firstName='John'").list();
			
			//display the students
			System.out.println("\n\nStudents who have last name of Duck or first name of John");
			displayStudents(theStudents);
			
			//query students where email like "paul@gmail.com"
			theStudents = session.createQuery("from Student s where"+" s.email LIKE '%@gmail.com'").list();
			System.out.println("\n\nStudents whose email ends with @gmail.com");
			displayStudents(theStudents);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		} finally {
			factory.close();
		}
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}
}
