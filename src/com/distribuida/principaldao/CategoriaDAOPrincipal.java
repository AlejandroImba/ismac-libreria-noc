package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class CategoriaDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		
		//Insert
		
		Categoria categoria=new Categoria(0, "Terror", "Cuentos tragicos");
		
		//categoriaDAO.add(categoria);
		
		
		///Update

		Categoria categoria2=new Categoria(58, "Tio", "Chill");
		
		//categoriaDAO.add(categoria2);
		
		//Delete
		
		categoriaDAO.del(58);
		
		
		//findOne
		try {
			Categoria categoria3= categoriaDAO.findOne(41);
			System.out.println(categoria3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		//findALL
		
	List<Categoria> categorias = categoriaDAO.findAll();
		
		
		for (Categoria item : categorias) {
			
			System.out.println(item.toString());
			
		}
		
		context.close();
		
		
		
	}

}
