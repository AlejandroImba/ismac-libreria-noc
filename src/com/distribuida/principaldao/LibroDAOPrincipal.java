package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;



public class LibroDAOPrincipal {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroDAO libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);
		//findAll
		List<Libro> libros= libroDAO.findAll();
		
		for (Libro item: libros) {
			System.out.println(item.toString());
		}
		context.close();
	}
	}


