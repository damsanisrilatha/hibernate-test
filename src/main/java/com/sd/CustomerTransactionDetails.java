package com.sd;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Customer;
import com.sd.entity.TransactionList;
import com.sd.utils.HibernateUtil;

public class CustomerTransactionDetails {

	public static void main(String[] args) {
	SessionFactory sessionFacory=	HibernateUtil.getsessionFactory();
	
	 Session session=sessionFacory.openSession();
	 
	Transaction tx= session.beginTransaction();
	
	Customer customerlist1=new Customer("harika","h@123","4547667","8898357");
	Customer customerlist2=new Customer("harika","h@123","4547667","8898357");
	session.save(customerlist1);
	session.save(customerlist2);
	List<TransactionList> transactionlist=new ArrayList();
	transactionlist.add(new TransactionList("own","B","transfer",500.89));
	transactionlist.add(new TransactionList("own","c","debit",300.89));
	transactionlist.add(new TransactionList("own","bank","debit",100.89));
	transactionlist.add(new TransactionList("own","e","transfer",100.89));
	for(TransactionList tlist:transactionlist)
	{
	session.save(tlist);
	tlist.setCustomer(customerlist1);
	}
	tx.commit();
	System.out.println("transactionlist inserted");
	
	}
}

