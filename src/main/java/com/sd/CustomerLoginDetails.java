package com.sd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Customer;
import com.sd.entity.CustomerLogin;
import com.sd.utils.HibernateUtil;

public class CustomerLoginDetails {
	public static void main(String[] args) {
		SessionFactory sessionFacory=	HibernateUtil.getsessionFactory();
		
		 Session session=sessionFacory.openSession();
		 Transaction	tx=	 session.beginTransaction();
		 Customer customer1=new Customer("own","B","transfer","500.89");
		 Customer customer2=new Customer("own","c","transfer","400.89");
		 
		 CustomerLogin customerlogin=new CustomerLogin("srinu","123@345");
		 customerlogin.setCustomers(customer1);
		 session.save(customer1);
		 session.save(customer2);
		 session.save(customerlogin);
		   
		 tx.commit();
}
}
