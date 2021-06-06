package com.login;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.flyaway.entity.admin;


public class LoginService {
	public String UpdatePassword(String id,String password) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
	    Transaction t=session.beginTransaction();  
	      
	    admin e1=new  admin();  
	    e1.setIdadmin(id);
	    e1.setPassword(password);
	    session.saveOrUpdate(e1);
	      
	    //session.persist(e1);  
	    
	    t.commit();  
	      
	    session.close();  
	   // System.out.println("success");
		return "success change password";  
	}  
}
