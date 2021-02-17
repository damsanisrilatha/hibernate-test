package com.sd.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Employe;
import com.sd.utils.HibernateUtil;

public class EmployeRepository {

	public Employe findById(Integer id) {
		SessionFactory sessionfactoty = HibernateUtil.getsessionFactory();
		Session session = sessionfactoty.openSession();
		Employe e = session.get(Employe.class, id);

		return e;

	}

	public Employe findByEmail(String email) {
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from employees where email=:name");
		query.setParameter("name", "email");
		List<Employe> emps = query.list();
		Employe employe = emps.get(0);
		return employe;
	}

	public Employe findByPhoneno(Integer phoneno) {
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from employees where phoneno=:name");
		query.setParameter("name", "phoneno");
		List<Employe> employes = query.list();

		if (employes != null && !employes.isEmpty()) {
			Employe employe = employes.get(0);
			return employe;
		}
		return null;
	}

	public Employe updateEmploye(Employe employe) {
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		session.update(employe);

		return employe;

	}

	public boolean deleteEmploye(Employe e) {
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		session.delete(e);
		return true;

	}

	public Employe save(Employe e) {

		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		Integer id = (Integer) session.save(e);
		e.setId(id);
		return e;
	}

	public List<Employe> saveAll(List<Employe> employe) {
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		List<Employe> emps = (List<Employe>) session.save(employe);
		return emps;

	}

	public static void main(String[] args) {

	}

}
