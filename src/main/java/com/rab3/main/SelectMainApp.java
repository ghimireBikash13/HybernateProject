package com.rab3.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab3.entities.AtntCustomersEntity;
import com.rab3.repositories.ProductRepository;

public class SelectMainApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-Context.xml");
		ProductRepository pr = (ProductRepository) ctx.getBean("productRepository");

		//For single obj to get from list do not use list but only the entity name
		//Below Method to get all the list where customers are from Nepal
		
		List<AtntCustomersEntity> a = pr.getByCountry("Nepal");
		if(a != null) {
			System.out.println(a.toString());
		}
		System.out.println("*******************************");
		for(AtntCustomersEntity obj:a) {
			System.out.println(obj.toString());
		}
		

	}
}
