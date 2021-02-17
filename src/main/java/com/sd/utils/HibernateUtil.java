package com.sd.utils;



import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	
public static SessionFactory  getsessionFactory()
{
	Configuration cfg=new Configuration();
	cfg.configure(new File("C:\\Mimmy\\workspace_hib\\hibernate-test\\src\\main\\java\\com\\sd\\xml\\hibernate.cfg.xml"));
SessionFactory sf=	cfg.buildSessionFactory();
	return sf;
	
}

}
