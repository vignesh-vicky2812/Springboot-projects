package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class DeleteStudentDemo {

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
			
			/*//delete student
			System.out.println("Deleting student: "+myStudent);
			session.delete(myStudent); */
			
			//delete student id=2
			System.out.println("Deleting student id=2");
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
			

		} finally {
			factory.close();
		}
	}
}
