package com.sd;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Student;
import com.sd.utils.HibernateUtil;

public class StudentDetails {
	

	public static void main(String[] args) {
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session s = sessionfactory.openSession();
		Transaction t = s.beginTransaction();
		Student s1 = new Student(1, "srinivas", 25, "sr@123", 89);
		Student s2 = new Student(2, "srini", 26, "sri@1234", 92);
		Student s3 = new Student(3, "minnu", 23, "m@23", 95);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		t.commit();
		Transaction tx = s.beginTransaction();
		Student std = s.get(Student.class, 179);
		std.setMarks(78);
		s.update(std);
		tx.commit();
		Transaction txn = s.beginTransaction();
		Student studentupdatedrow = new Student(178, "srinivas", 30,
				"srinivas@gmail", 66);
		s.update(studentupdatedrow);
		txn.commit();

		List<Student> q = s.createQuery("from Student").list();
		for (Student student : q) {
			System.out.println(student);
		}

		Query query = s.createQuery("from Student where name =:name");
		query.setParameter("name", "minnu");
		List<Student> listOfStudents=query.list();
		System.out.println(listOfStudents);
		
		Transaction txn1=s.beginTransaction();
	Student stddelete=	s.get(Student.class, 181);
		s.delete(stddelete);
		txn1.commit();
		
		Transaction tx3 = s.beginTransaction();
		Query query1 =s.createQuery("delete from Student where name=:name");
		query1.setParameter("name", "minnu");
		Integer updated = query1.executeUpdate();
		tx3.commit();
		System.out.println(updated);
		

	}
}
