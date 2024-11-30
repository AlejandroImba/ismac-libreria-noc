package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;


public class ClienteDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		//Insert
		
		Cliente cliente=new Cliente(0, "17513413140", "Tilinazo", "Insano", "Puembo", "0987654321","insanofreefire@outlook.com");
		
		//clienteDAO.add(cliente2);
		
		
		///Update

		Cliente cliente2=new Cliente(28, "1750866814", "Shirley", "Camacho", "El oro", "0992860039","stevbena777@gmail.com");
		
		//clienteDAO.add(cliente2);
		
		//Delete
		
		//clienteDAO.del(41);
		
		
		//findOne
		try {
			Cliente cliente3= clienteDAO.findOne(41);
			System.out.println(cliente3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		//findALL
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());
			
		}
		
		context.close();
		
		
		

	}

}
