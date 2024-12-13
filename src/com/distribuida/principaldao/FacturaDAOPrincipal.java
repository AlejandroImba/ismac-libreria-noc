package com.distribuida.principaldao;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class FacturaDAOPrincipal {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);
		List<Factura> facturas= facturaDAO.findAll();
		for (Factura item: facturas) {
			System.out.println(item.toString());
		}
		context.close();

	}

}
