package com.sd;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entity.Customer;
import com.sd.entity.Order;
import com.sd.utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sessionfactory = HibernateUtil.getsessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		List<Order> list=new ArrayList<Order>();
		list.add(new Order(1, "sri", "phone", 12000.456));
		list.add(new Order(2, "srilu", "laptop", 42000.456));
		list.add(new Order(3, "srinu", "pen", 20.45));
		list.add(new Order(4, "srinivas", "Book", 120.09));
		list.add(new Order(5, "srilatha", "pencil", 10.50));
		
		for(Order order1 : list)
		{
			session.save(order1);
		}
		
		tx.commit();
		System.out.println("inserted");
		
		Transaction tx1=session.beginTransaction();
		  Order updateorder=session.get(Order.class, 133);
		  updateorder.setItemname("dress");
		  session.update(updateorder);
		  
		  tx1.commit();
		 // ------------------------
		Transaction tx2=session.beginTransaction();
		Order o=new Order(134,"satish","t-shirt",234.89);
		session.update(o);
		tx2.commit();
		
		/*List<Order> orders = session.createQuery("from Order").list();
		
		for(Order ord: orders){
			System.out.println(ord);
		}*/
		
		/*Query<Order> query = session.createQuery("from Order where customername = :name");
		query.setParameter("name", "srinu");
		List<Order> orderList = query.list();
		System.out.println(orderList);
		//update price
		 Transaction tx3=session.beginTransaction();
		Order or= session.get(Order.class, 17);
		or.setItemname("iphone");
		session.update(or);
		tx3.commit();*/
		
		
		Query<Order> query1=session.createQuery("from Order order by price");
		 
		 List<Order> pricelist=query1.list();
		 System.out.println("OrderByPrice"+pricelist);
		 
		 //========================================================customer
		
		 
		
		


	}
}
