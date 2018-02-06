package com.example.demo;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.cfg.*;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Address address = new Address();
		address.setAid(3);
		address.setName("Goce Delcev");

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Address.class);
		con.addAnnotatedClass(Person.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

//		Transaction tx = session.beginTransaction();
//		session.save(address);
//		tx.commit();

		Person person = new Person(2, "Nadica");
//		Transaction tx = session.beginTransaction();
//		session.save(person);
//		tx.commit();

		Transaction tx;
		tx = session.beginTransaction();
		address = session.get(Address.class, 1);
		//address.getPersonList().add(person);
		tx.commit();


		System.out.println(address.getName());

	}
}
