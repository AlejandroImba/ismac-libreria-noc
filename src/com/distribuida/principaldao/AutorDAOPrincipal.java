package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class AutorDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl",AutorDAO.class);
		
		//Insert
		
		Autor autor=new Autor(0, "Tio", "Chill", "Ecuador", "Av.micasa girando a la izquierda", "094561237","tiochill@outlook.com");
		
		//autorDAO.add(autor);
		
		
		///Update

		Autor autor2=new Autor(54, "Tio", "Chill de cojones", "Ecuador", "Av.micasa girando a la izquierda", "094561237","tiochill@outlook.com");
		
		//autorDAO.add(autor2);
		
		//Delete
		
		//autorDAO.del(54);
		
		
		//findOne
		try {
			Autor autor3= autorDAO.findOne(41);
			System.out.println(autor3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		//findALL
		
		List<Autor> autores = autorDAO.findAll();
		
		
		for (Autor item : autores) {
			
			System.out.println(item.toString());
			
		}
		
		context.close();
		
		
	}

}
