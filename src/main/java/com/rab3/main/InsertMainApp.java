package com.rab3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.rab3.entities.AtntCustomersEntity;
import com.rab3.repositories.ProductRepository;

public class InsertMainApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-Context.xml");
		ProductRepository pr = (ProductRepository) ctx.getBean("productRepository");
		
		AtntCustomersEntity ae = new AtntCustomersEntity();
		ae.setName("Basu Koirala");
		ae.setContactName("Mahesh Koirala");
		ae.setAddress("Dhankuta-4, Akhisalla");
		ae.setCity("Jhapa");
		ae.setZip_Code(2786);
		ae.setCountry("Nepal");
		
		pr.sava(ae);

	}

}
