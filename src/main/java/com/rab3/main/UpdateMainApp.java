package com.rab3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab3.entities.AtntCustomersEntity;
import com.rab3.repositories.ProductRepository;

public class UpdateMainApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-Context.xml");
		ProductRepository pr = (ProductRepository) ctx.getBean("productRepository");

		
		AtntCustomersEntity ace = pr.getById(16);
		
		ace.setName("Dhiraj Lamichane");
		ace.setContactName("Shanker Lamichane");
		ace.setAddress("Halgada-4,Sunsari");
		ace.setCity("Itahari");
		ace.setZip_Code(2207);
		ace.setCountry("Nepal");

		pr.update(ace);

		
	}

}
