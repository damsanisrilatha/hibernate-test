package com.sd;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Author;
import com.sd.entity.Book;
import com.sd.entity.Laptop;
import com.sd.entity.Student;
import com.sd.utils.HibernateUtil;

public class StudentLaptop {

	public static void main(String[] args) {
		SessionFactory sessionfactory=	HibernateUtil.getsessionFactory();
		Session session=sessionfactory.openSession();
		
		Transaction txn=session.beginTransaction();
		Student b=new Student(2, "srini", 26, "sri@1234", 92);
		
		Laptop laptop1=new Laptop(101,"4567","dell");
		Laptop laptop2=new Laptop(102,"7867","lenovo");
		
		laptop1.setStudent(b);
		laptop2.setStudent(b);
		
		session.save(b);

		
		session.save(laptop1);
		session.save(laptop2);
		

		txn.commit();
		
		
		Student student = session.get(Student.class, 1);
		System.out.println(student.getLaptops());
		
		Laptop laptop = session.get(Laptop.class, 2);
		
		System.out.println("Laptop student: "+laptop.getStudent());


	}

}
