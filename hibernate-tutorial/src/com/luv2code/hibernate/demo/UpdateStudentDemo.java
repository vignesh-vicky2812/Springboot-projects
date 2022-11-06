package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class UpdateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		try {

			//My new code 

			int studentId=1; 
			
			//now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrive student based on id
			System.out.println("\nGeting student with id: "+studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");

			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
			
			
			//new code
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//update email for all students
			System.out.println("Update email for all students");
			session.createQuery("update Student set email='abc@yahoo.com'").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();
			

		} finally {
			factory.close();
		}
	}
}
