package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		try {

			//create objects
			/*Instructor tempInstructor = new Instructor("vignesh","vicky","vignesh@gmail.com");

			InstructorDetail tempInstructorDetail =  new InstructorDetail("vignesh.com/youtube","Luv 2 code"); */

			Instructor tempInstructor = new Instructor("dhoni","ms","dhoni@gmail.com");

			InstructorDetail tempInstructorDetail =  new InstructorDetail("dhoni.com/youtube","Luv 2 code");
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);


			//start a transaction
			session.beginTransaction();

			//save a instructor
			//
			//Note: this will also save details object
			//because of CascadeType.ALL
			System.out.println("Saving instructor: "+tempInstructor);
			session.save(tempInstructor);

			//commit transaction
			session.getTransaction().commit();

			System.out.println("Done");


		} finally {
			factory.close();
		}

	}
}
