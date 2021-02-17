package com.sd;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Address;
import com.sd.entity.Department;
import com.sd.entity.Employe;
import com.sd.entity.Salary;
import com.sd.utils.HibernateUtil;

public class EmployeDetails {

	public static void main(String[] args) {
		SessionFactory sessionFacory=	HibernateUtil.getsessionFactory();
		
		 Session session=sessionFacory.openSession();
		 Transaction	tx=	 session.beginTransaction();
		 Employe emp=new Employe("srini","karre","s@R",45679);
		 session.save(emp);
		 
		 Salary sal=new Salary(65434,65624.6);
		 session.save(sal);
		 sal.setEmp(emp);
		 session.save(sal);
		 List<Address> address=new ArrayList();
		address.add(new Address(1,"AJRlayout","minnekolala","bengaluru","india",46753));
		 address.add(new Address(1,"AJRlayout","l005","bengaluru","india",673453));
		for(Address a:address)
		{
		 session.save(a);
		 a.setEmployes(emp);
		 
		}
		
		Department d=new Department(1,"development","employe");
		session.save(d);
		
		List<Employe> employe=new ArrayList();
		employe.add(new Employe("srini","karre","s@R",45679));
		employe.add(new Employe("minnu","d","md@",9567));
			for(Employe e:employe)
			{	
			session.save(e);
			e.setDept(d);
			}
		
		
		
		
		 
		 
		 
		 tx.commit();
		 
		 

	}

}
