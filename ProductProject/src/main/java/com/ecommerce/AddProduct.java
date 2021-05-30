package com.ecommerce;


import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class AddProduct {  
public static void main(String[] args) {  }

public String result(String name,BigDecimal price ,  String hdd, String cpu,  String ram) {
	
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	
    Transaction t=session.beginTransaction();  
      
    EProduct e1=new EProduct();  
    e1.setName(name);  
    e1.setPrice(price);  
    e1.setDateAdded(new Date()); 
       
    ProductParts p1=new ProductParts();  
    p1.setHdd(hdd);  
    p1.setCpu(cpu);  
    p1.setRam(ram);  
      
    e1.setParts(p1);  
      
    session.persist(e1);  
    
    t.commit();  
      
    session.close();  
    System.out.println("success");
	return "success";  
}  
}  