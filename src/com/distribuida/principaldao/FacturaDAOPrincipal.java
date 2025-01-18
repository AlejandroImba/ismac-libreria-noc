package com.distribuida.principaldao;


import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Cliente;
public class FacturaDAOPrincipal {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		///ADDD
	//	Cliente cliente=new clienteDAO.findone(1);
		//Factura factura = new Factura(0,"FAC-001",new Date(), 123.32, 12.3,1141.20, cliente);
		
		
		List<Factura> facturas= facturaDAO.findAll();
		for (Factura item: facturas) {
			System.out.println(item.toString());
		}
		context.close();

	}

}
